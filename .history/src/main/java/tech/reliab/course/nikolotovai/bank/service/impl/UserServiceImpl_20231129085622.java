package tech.reliab.course.nikolotovai.bank.service.impl;

import java.util.Random;

import static tech.reliab.course.nikolotovai.bank.utils.Constants.*;

import tech.reliab.course.nikolotovai.bank.entity.User;
import tech.reliab.course.nikolotovai.bank.service.UserService;

public class UserServiceImpl implements UserService {
  public int calculateCreditRating(User user) {
    final int rating = (int)Math.ceil(user.getMonthlyIncome() / 1000) * 100;
    user.setCreditRating(rating);
    return rating;
  }

  public User create(User user) {
    if (user == null) {
      return null;
    }

    if (user.getId() < 0) {
      System.out.println("Error: user id must be non-negative");
      return null;
    }

    if (user.getBank() == null) {
      System.out.println("Error: can not create user without bank");
      return null;
    }

    User createdUser = new User(user);

    final Random random = new Random();

    final double monthlyIncome = random.nextDouble() * MAX_USER_MONTHLY_INCOME;
    createdUser.setMonthlyIncome(monthlyIncome);
    calculateCreditRating(createdUser);

    return createdUser;
  }
}
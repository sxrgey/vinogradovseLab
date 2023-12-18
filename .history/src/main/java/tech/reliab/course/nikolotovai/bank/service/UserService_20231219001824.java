package tech.reliab.course.vinogradovse.bank.service;

import tech.reliab.course.vinogradovse.bank.entity.User;

public interface UserService {
  User create(User user);
  int calculateCreditRating(User user);
}

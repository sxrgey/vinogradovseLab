package tech.reliab.course.vinogradovse.bank.service;

import tech.reliab.course.vinogradovse.bank.entity.BankAtm;

public interface AtmService {
  BankAtm create(BankAtm bankAtm);
  boolean depositMoney(BankAtm bankAtm, double amount);
  boolean withdrawMoney(BankAtm bankAtm, double amount);
}

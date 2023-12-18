package tech.reliab.course.vinogradovse.bank.service;

import tech.reliab.course.vinogradovse.bank.entity.CreditAccount;

public interface CreditAccountService {
  CreditAccount create(CreditAccount creditAccount);
  boolean makeMonthlyPayment(CreditAccount account);
}

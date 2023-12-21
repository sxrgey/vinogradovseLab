package tech.reliab.course.vinogradovse.bank.service;

import java.util.List;

import tech.reliab.course.vinogradovse.bank.entity.CreditAccount;

public interface CreditAccountService {
  CreditAccount create(CreditAccount creditAccount);
  public CreditAccount getCreditAccountById(int id);
  public List<CreditAccount> getAllCreditAccounts();
  boolean makeMonthlyPayment(CreditAccount account);
}

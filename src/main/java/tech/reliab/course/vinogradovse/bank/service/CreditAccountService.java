package tech.reliab.course.vinogradovse.bank.service;

import java.util.List;

import tech.reliab.course.vinogradovse.bank.entity.CreditAccount;
import tech.reliab.course.vinogradovse.bank.exception.PaymentException;
import tech.reliab.course.vinogradovse.bank.exception.UniquenessException;

public interface CreditAccountService {
  CreditAccount create(CreditAccount creditAccount) throws UniquenessException;
  public CreditAccount getCreditAccountById(int id);
  public List<CreditAccount> getAllCreditAccounts();
  boolean makeMonthlyPayment(CreditAccount account) throws PaymentException;
}

package tech.reliab.course.vinogradovse.bank.service;

import java.util.List;

import tech.reliab.course.vinogradovse.bank.entity.PaymentAccount;
import tech.reliab.course.vinogradovse.bank.exception.UniquenessException;

public interface PaymentAccountService {
  PaymentAccount create(PaymentAccount paymentAccount) throws UniquenessException;
  public void printPaymentData(int id);
  public PaymentAccount getPaymentAccountById(int id);
  public List<PaymentAccount> getAllPaymentAccounts();
  boolean depositMoney(PaymentAccount account, double amount);
  boolean withdrawMoney(PaymentAccount account, double amount);
}

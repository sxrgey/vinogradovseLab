package tech.reliab.course.vinogradovse.bank.exception;

public class BankFailureException extends RuntimeException {
  public BankFailureException(String problem) {
		super("Error: bank critical failure: " + problem);
	}
}
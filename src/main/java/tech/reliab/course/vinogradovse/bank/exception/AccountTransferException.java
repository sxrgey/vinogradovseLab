package tech.reliab.course.vinogradovse.bank.exception;

public class AccountTransferException extends RuntimeException {
  public AccountTransferException(String problem) {
		super("Error: account transfer is not possible: " + problem);
	}
}
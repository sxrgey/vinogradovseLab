package tech.reliab.course.vinogradovse.bank;

import java.time.LocalDate;
import java.util.Locale;
import tech.reliab.course.vinogradovse.bank.entity.Bank;
import tech.reliab.course.vinogradovse.bank.entity.BankAtm;
import tech.reliab.course.vinogradovse.bank.entity.BankOffice;
import tech.reliab.course.vinogradovse.bank.entity.CreditAccount;
import tech.reliab.course.vinogradovse.bank.entity.Employee;
import tech.reliab.course.vinogradovse.bank.entity.PaymentAccount;
import tech.reliab.course.vinogradovse.bank.entity.User;
import tech.reliab.course.vinogradovse.bank.service.AtmService;
import tech.reliab.course.vinogradovse.bank.service.BankOfficeService;
import tech.reliab.course.vinogradovse.bank.service.BankService;
import tech.reliab.course.vinogradovse.bank.service.CreditAccountService;
import tech.reliab.course.vinogradovse.bank.service.EmployeeService;
import tech.reliab.course.vinogradovse.bank.service.PaymentAccountService;
import tech.reliab.course.vinogradovse.bank.service.UserService;
import tech.reliab.course.vinogradovse.bank.service.impl.AtmServiceImpl;
import tech.reliab.course.vinogradovse.bank.service.impl.BankOfficeServiceImpl;
import tech.reliab.course.vinogradovse.bank.service.impl.BankServiceImpl;
import tech.reliab.course.vinogradovse.bank.service.impl.CreditAccountServiceImpl;
import tech.reliab.course.vinogradovse.bank.service.impl.EmployeeServiceImpl;
import tech.reliab.course.vinogradovse.bank.service.impl.PaymentAccountServiceImpl;
import tech.reliab.course.vinogradovse.bank.service.impl.UserServiceImpl;
import tech.reliab.course.vinogradovse.bank.utils.BankAtmStatus;


public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    BankService bankService = new BankServiceImpl();
    Bank bank = bankService.create(new Bank("Nikolotov Bank"));
    System.out.println(bank);

    BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
    BankOffice bankOffice = bankOfficeService.create(new BankOffice(
      "Main office of Nikolotov Bank", 
      "Belgorod, Pushkina st., 1", 
      bank, 
      true, 
      true,
      0,
      true,
      true,
      true,
      bank.getTotalMoney(),
      950
    ));
    System.out.println(bankOffice);

    EmployeeService employeeService = new EmployeeServiceImpl();
    Employee employee = employeeService.create(new Employee("Sergey", LocalDate.of(2002, 7, 21), "CEO", bank, true, bankOffice, true, 1));
    System.out.println(employee);

    AtmService atmService = new AtmServiceImpl();
    BankAtm bankAtm = atmService.create(new BankAtm("Atm1", bankOffice.getAddress(), BankAtmStatus.WORKING, bank, bankOffice, employee, true, true, 0, 25));
    System.out.println(bankAtm);

    UserService userService = new UserServiceImpl();
    User user = userService.create(new User("Luna", LocalDate.of(1999, 1, 15), "Google", 3000.0, bank, 10000));
    System.out.println(user);

    PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
    PaymentAccount paymentAccount = paymentAccountService.create(new PaymentAccount(user, bank, 500));
    System.out.println(paymentAccount);

    CreditAccountService creditAccountService = new CreditAccountServiceImpl();
    CreditAccount creditAccount = creditAccountService.create(new CreditAccount(user, bank, LocalDate.of(2022, 1, 1), LocalDate.of(2025, 1, 1), 36, 3600, 3600, 100, 5, employee, paymentAccount));
    System.out.println(creditAccount);
  }
}
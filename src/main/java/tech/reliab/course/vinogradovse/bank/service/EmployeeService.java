package tech.reliab.course.vinogradovse.bank.service;

import tech.reliab.course.vinogradovse.bank.entity.BankOffice;
import tech.reliab.course.vinogradovse.bank.entity.Employee;

public interface EmployeeService {
  Employee create(Employee employee);
  boolean transferEmployee(Employee employee, BankOffice bankOffice);
}
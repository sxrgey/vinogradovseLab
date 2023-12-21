package tech.reliab.course.vinogradovse.bank.service;

import java.util.List;

import tech.reliab.course.vinogradovse.bank.entity.BankOffice;
import tech.reliab.course.vinogradovse.bank.entity.Employee;

public interface EmployeeService {
  Employee create(Employee employee);
  public Employee getEmployeeById(int id);
  public List<Employee> getAllEmployees();
  boolean transferEmployee(Employee employee, BankOffice bankOffice);
}
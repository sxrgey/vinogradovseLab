package tech.reliab.course.vinogradovse.bank.service;

import java.util.List;

import tech.reliab.course.vinogradovse.bank.entity.BankOffice;
import tech.reliab.course.vinogradovse.bank.entity.Employee;
import tech.reliab.course.vinogradovse.bank.exception.UniquenessException;

public interface EmployeeService {
  Employee create(Employee employee) throws UniquenessException;
  public Employee getEmployeeById(int id);
  public List<Employee> getAllEmployees();
  boolean transferEmployee(Employee employee, BankOffice bankOffice);
  public boolean isEmployeeSuitable(Employee employee);
}
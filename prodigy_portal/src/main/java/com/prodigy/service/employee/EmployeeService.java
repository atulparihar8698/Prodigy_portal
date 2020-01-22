package com.prodigy.service.employee;

import java.util.List;

import com.prodigy.model.employee.Employee;

public interface EmployeeService {
public Employee createEmployee(Employee employee);
public Employee updateEmployee(Employee employee);
public void deleteEmployee(String employeeId);
public Employee getEmployeeById(String employeeId);
public List<Employee> getEmployeeAll();
public String getMaxEmployeeID();
}

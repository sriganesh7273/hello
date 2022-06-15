package com.sapient.asde.service;

import com.sapient.asde.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    String getEmployeeWithHighestSalary(List<Employee> employeeList);
 List<Employee> getEmployeesOfGivenJob(List<Employee> employeeList, String job);
  Double getTotalSalary(List<Employee> employeeList);
 Map<String,Integer> getJobWiseEmployees(List<Employee> employeeList);
//    returns Map where key is Job and number of employees with that job as value
}

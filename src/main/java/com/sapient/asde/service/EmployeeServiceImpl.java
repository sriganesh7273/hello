package com.sapient.asde.service;

import com.sapient.asde.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public String getEmployeeWithHighestSalary(List<Employee> employeeList) {
        return employeeList.stream().max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).get().getEname();
    }

    @Override
    public List<Employee> getEmployeesOfGivenJob(List<Employee> employeeList, String job) {
        return employeeList.stream().filter(employee -> employee.getJob().equals(job)).collect(Collectors.toList());
    }

    @Override
    public Double getTotalSalary(List<Employee> employeeList) {
        return employeeList.stream().map(Employee::getSalary).reduce(Double::sum).orElse(null);
    }

    @Override
    public Map<String, Integer> getJobWiseEmployees(List<Employee> employeeList) {
        Map<String, Integer> result=new HashMap<>();
        employeeList.stream().forEach(employee -> result.put(employee.getJob(),result.getOrDefault(employee.getJob(),0)+1));
        return result;
    }
}

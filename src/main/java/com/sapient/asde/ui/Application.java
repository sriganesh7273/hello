package com.sapient.asde.ui;


import com.sapient.asde.exception.EmployeeException;
import com.sapient.asde.model.Employee;
import com.sapient.asde.service.EmployeeService;
import com.sapient.asde.service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application
{
    public static void main( java.lang.String[] args )
    {
        Employee[] employees = {
                new Employee(12345L, "Sri Ganesh", 12.0, "A"),
                new Employee(246L,"Sri",912.0, "A"),
                new Employee(12386L,"GA",-357.0,"A"),
                new Employee(12L, "Sri FF", 12343.0, "B"),
                new Employee(26L,"Sriii",19040.0, "C"),
                new Employee(386L,"GAAA",-7.0,"C"),
                new Employee(125L, " Ganesh", 18872.0, "A"),
                new Employee(246L,"ss",912.0, "B"),
                new Employee(186L,"FGR",-357.0,"A"),
                new Employee(127L, "Sri Ganesh Sharma", 123313.0, "B"),
                new Employee(2653L,"UT",123.9, "C"),
                new Employee(383546L,"RT",-79.0,"A")
        };
        List<Employee> employeeList=new ArrayList<>(Arrays.asList(employees));
        EmployeeService employeeService=new EmployeeServiceImpl();
        try{

            System.out.println("Employees with highest salary");
            System.out.println(employeeService.getEmployeeWithHighestSalary(employeeList));


            System.out.println("Employees with Job A");
            for(Employee e:employeeService.getEmployeesOfGivenJob(employeeList,"A"))
                System.out.println(e);

            System.out.println("Employees total salary");
            System.out.println(employeeService.getTotalSalary(employeeList));


            System.out.println("Job wise employees");
            System.out.println(employeeService.getJobWiseEmployees(employeeList));



            for(Employee employee:employees) {
                if (employee.getSalary() < 0.0)
                    throw new EmployeeException("Please update employee salary should not be negative");
                else
                    System.out.println(employee);
            }
        }catch (EmployeeException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

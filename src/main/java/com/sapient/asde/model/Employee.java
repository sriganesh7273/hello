package com.sapient.asde.model;

public class Employee {
    Long empid;

    java.lang.String ename;

    Double salary;

    String job;

    public Employee(Long empid, java.lang.String ename, Double salary, String job) {
        this.empid = empid;
        this.ename = ename;
        this.salary = salary;
        this.job = job;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public java.lang.String getEname() {
        return ename;
    }

    public void setEname(java.lang.String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String string) {
        this.job = string;
    }

    @Override
    public java.lang.String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", job=" + job +
                '}';
    }
}

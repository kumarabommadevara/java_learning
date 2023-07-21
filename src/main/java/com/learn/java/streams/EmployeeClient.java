package com.learn.java.streams;

import java.util.List;

public class EmployeeClient {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtils.createEmployees();

        EmployeeUtils.getEmployees(employees);
        EmployeeUtils.getEmployeesBasedOnLocation(employees, "hyd");
        int age = 40;
        final List<Employee> employeeGreaterThen = EmployeeUtils.employeeGreaterThen(employees, age);
        System.out.println("employees greater then age= " + age + " " + employeeGreaterThen);

        EmployeeUtils.employeesGroupByLoc(employees);
        EmployeeUtils.employeesSalaryByLoc(employees);
    }
}

package com.learn.java.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class EmployeeClient {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtils.createEmployees();

        EmployeeUtils.getEmployees(employees);
        EmployeeUtils.getEmployeesBasedOnLocation(employees,"hyd");
         EmployeeUtils.isEmployeeGreaterThen(employees,30).forEach(e-> System.out.println(e));

    }
}

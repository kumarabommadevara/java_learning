package com.learn.java.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeUtils {

    public static List<Employee> createEmployees(){

        Employee employee=new Employee();

        Employee employee1=new Employee(1,"harsha", LocalDate.of(2021,10,06),
                LocalDate.of(1992,05,06),
                new BigDecimal(65000));

        Employee employee2=new Employee(2,"sai", LocalDate.of(2018,05,06),
                LocalDate.of(1997,05,12),
                new BigDecimal(50000));
return  List.of(employee1,employee2);

    }

    public static void getEmployees(List<Employee> employeeList)
    {
        System.out.println("------Printing employees------");
         employeeList.forEach(employee -> System.out.println(employee));
    }
}

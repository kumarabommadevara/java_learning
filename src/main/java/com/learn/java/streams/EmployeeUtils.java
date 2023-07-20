package com.learn.java.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUtils {

    public static List<Employee> createEmployees(){

        Employee employee=new Employee();

        Employee employee1=new Employee(1,"harsha", LocalDate.of(2021,10,06),
                LocalDate.of(1992,05,06),
                "hyd",
                new BigDecimal(65000));

        Employee employee2=new Employee(2,"sai", LocalDate.of(2018,05,06),
                LocalDate.of(1997,05,12),"guntur",
                new BigDecimal(50000));
return  List.of(employee1,employee2);

    }

    public static void getEmployees(List<Employee> employeeList)
    {
        System.out.println("------Printing employees------");
         employeeList.forEach(System.out::println);
    }

    public static void getEmployeesBasedOnLocation(List<Employee> employeeList, String location)
    {
        System.out.println("printing employees at location" +  location);
        employeeList.stream().filter(employee -> employee.getJobLocation().equals(location)).
                collect(Collectors.toList()).forEach(System.out::println);

    }
   /* public static void getEmployeesAgeGreaterThen(List<Employee> employeeList,int age)
    {
        employeeList.stream().filter(employee ->employee.getEmployeeDob()))

    }*/
  public static List<Boolean> isEmployeeGreaterThen(List<Employee> employeeList, int age) {

     return  employeeList.stream().map(employee -> employee.getEmployeeDob()).
              map(emp -> getAge(emp.getYear()) > age).collect(Collectors.toList());

  }
 private    static int   getAge(int year)

    {
        int currentYear=LocalDate.now().getYear();
        return currentYear - year;
        }

}

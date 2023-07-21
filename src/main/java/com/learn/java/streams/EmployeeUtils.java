package com.learn.java.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeUtils {

    public static List<Employee> createEmployees() {

        Employee employee = new Employee();

        Employee employee1 = new Employee(1, "harsha", LocalDate.of(2021, 10, 06),
                LocalDate.of(1992, 05, 06),
                "hyd",
                new BigDecimal(65000));

        Employee employee2 = new Employee(2, "sai", LocalDate.of(2018, 05, 06),
                LocalDate.of(1997, 05, 12), "guntur",
                new BigDecimal(50000));
        Employee employee3 = new Employee(3, "raj", LocalDate.of(2021, 10, 06),
                LocalDate.of(1990, 05, 06),
                "hyd",
                new BigDecimal(65000));
        return List.of(employee1, employee2, employee3);

    }

    public static void getEmployees(List<Employee> employeeList) {
        System.out.println("------Printing employees------");
        employeeList.forEach(System.out::println);
    }

    public static void getEmployeesBasedOnLocation(List<Employee> employeeList, String location) {
        System.out.println("printing employees at location" + location);
        employeeList.stream().filter(employee -> employee.getJobLocation().equals(location)).
                collect(Collectors.toList()).forEach(System.out::println);
    }

    public static List<Employee> employeeGreaterThen(List<Employee> employeeList, int age) {

        return employeeList.stream().filter(employee -> checkEmployeeAge(employee, age)).collect(Collectors.toList());
    }

    private static boolean checkEmployeeAge(Employee employee, int age) {

        return LocalDate.now().getYear() - employee.getEmployeeDob().getYear() > age ? true : false;

    }

    private static int getAge(int year) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - year;
    }

    public static void employeesGroupByLoc(List<Employee> employees) {

        final Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(employee -> employee.getJobLocation()));
        map.forEach((k, v) -> {
            System.out.println("Job Location= " + k);
            System.out.println("employees= " + v);
        });
    }

    public static void employeesSalaryByLoc(List<Employee> employees) {
        employees.stream().collect(
                        Collectors.groupingBy(emp -> emp.getJobLocation(),
                                Collectors.summingDouble(emp -> emp.getSalary().doubleValue())))
                .forEach((k, v) -> {
                    System.out.println("Job Location =" + k);
                    System.out.println("Total Salary =" + v);
                });
    }


}

package com.learn.java.streams;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private LocalDate employyeeDoj;
    private LocalDate employeeDob;

    private BigDecimal Salary;
}
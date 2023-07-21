package com.learn.java.streams;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private LocalDate employyeeDoj;
    private LocalDate employeeDob;
    private String jobLocation;
    private BigDecimal salary;
}
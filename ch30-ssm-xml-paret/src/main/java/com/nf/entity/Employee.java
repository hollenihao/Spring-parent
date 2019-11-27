package com.nf.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@ToString
public class Employee {
private Integer id;
    @NotEmpty
@Size(min = 1,max = 16)
private String username;
@Min(0)
private BigDecimal salary;
@FutureOrPresent
private Date hiredate;
}

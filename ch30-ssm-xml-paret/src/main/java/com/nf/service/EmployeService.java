package com.nf.service;

import com.nf.entity.Employee;

import java.util.List;

public interface EmployeService  {
    void insert(Employee employee);
    List<Employee> getAll(int pageNum,int pageSize);

}

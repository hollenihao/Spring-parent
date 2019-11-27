package com.nf.dao;

import com.nf.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    void insert(Employee employee);
    List<Employee> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    void deleteById(int deptid);
}

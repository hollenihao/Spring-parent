package com.service;

import com.dao.EmployeDao;
import com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
        @Autowired
    private EmployeDao dao;
        public List<Employee> getAll(int pageNum,int pageSize){
            return dao.getAll(pageNum,pageSize);
        }

}

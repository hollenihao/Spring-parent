package com.nf.service.impl;

import com.nf.dao.EmployeeDao;
import com.nf.entity.Employee;
import com.nf.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeService {
    @Autowired
    private EmployeeDao dao;
    @Override
    public void insert(Employee employee) {
        dao.insert(employee);
    }

    @Override
    public List<Employee> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum, pageSize);
    }


}

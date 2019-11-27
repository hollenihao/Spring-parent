package com.nf.demo.service.impl;

import com.nf.demo.dao.EmployeDao;
import com.nf.demo.entity.EmployeeEntity;
import com.nf.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeDao dao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum, pageSize);
    }

    @Override
    public void insert(EmployeeEntity employeeEntity) {
        dao.insert(employeeEntity);
    }
}

package com.nf.service.impl;

import com.nf.dao.DeptDao;
import com.nf.dao.EmployeDao;
import com.nf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeDao employeDao;

    @Transactional
    @Override
    public void deleteById(int id) {
        employeDao.deleteById(id);
    }
}

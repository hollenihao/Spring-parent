package com.nf.service.impl;

import com.nf.dao.DeptDao;
import com.nf.dao.EmployeeDao;
import com.nf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void deleteById(int deptId) {
        employeeDao.deleteById(deptId);
        deptDao.deleteById(deptId);
    }
}

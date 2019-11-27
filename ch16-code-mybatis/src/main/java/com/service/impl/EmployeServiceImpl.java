package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeDao;
import com.entity.Dept;
import com.entity.Employe;
import com.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeServiceImpl implements EmployeService {
    @Autowired
    private EmployeDao employeDao;
    @Autowired
    private DeptDao deptDao;


    @Override
    public List<Employe> getAll(int pageNum, int pageSize) {
        return employeDao.getAll(pageNum,pageSize);
    }

    //事务管理jdbc数据库
    @Transactional
    @Override
    public void txDemo() {
        deptDao.delete();
        employeDao.insert();
    }
}

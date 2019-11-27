package com.service.impl;

import com.dao.EmployeDao;

public class EmployeServiceImpl2 implements EmployeDao {

    public EmployeDao dao;

    public void setDao(EmployeDao dao) {
        this.dao = dao;
    }

    @Override
    public void update() {
        System.out.println("update employee222---");
        dao.update();
    }
}

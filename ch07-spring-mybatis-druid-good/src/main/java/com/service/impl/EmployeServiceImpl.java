package com.service.impl;

import com.dao.EmployeDao;
import com.entity.Employe;
import com.service.EmployeService;

public class EmployeServiceImpl implements EmployeService {

    private EmployeDao dao;

    public void setDao(EmployeDao dao) {
        this.dao = dao;
    }

    @Override
    public Employe getById() {
        return dao.getById();
    }
}

package com.service.Impl;

import com.dao.EmployeDao;
import com.entity.Employe;
import com.service.EmployeService;

import java.util.List;

public class EmployeServiceImpl implements EmployeService {
    private EmployeDao dao;

    public void setDao(EmployeDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Employe> getAll(int pageNum, int pageSize) {
        return dao.getAll(pageNum,pageSize);
    }
}

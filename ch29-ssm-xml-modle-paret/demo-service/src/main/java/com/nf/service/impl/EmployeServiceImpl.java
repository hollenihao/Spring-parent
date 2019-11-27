package com.nf.service.impl;

import com.nf.dao.DeptDao;
import com.nf.dao.EmployeDao;
import com.nf.entity.Employe;
import com.nf.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
    private EmployeDao employeDao;


    @Override
    public List<Employe> getAll(int pageNum, int pageSize) {
        return employeDao.getAll(pageNum, pageSize);
    }

    @Override
    public void isnert(Employe employe) {
        employeDao.insert(employe);
    }

}

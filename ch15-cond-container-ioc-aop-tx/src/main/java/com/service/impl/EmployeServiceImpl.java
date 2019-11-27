package com.service.impl;

import com.dao.EmployeDao;
import com.dao.impl.EmployedaoImpl;
import com.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
        private EmployeDao dao;

    public void setDao(EmployeDao dao) {
        this.dao = dao;
    }

    @Override
    public void update() {

        dao.update();
    }
}

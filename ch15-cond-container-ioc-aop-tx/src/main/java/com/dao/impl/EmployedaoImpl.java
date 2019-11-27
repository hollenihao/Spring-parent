package com.dao.impl;

import com.dao.EmployeDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmployedaoImpl implements EmployeDao {
    public EmployedaoImpl() {
        System.out.println("dao构造函数");
    }

    @Override
    public void update() {
        System.out.println("update employee");
    }
}

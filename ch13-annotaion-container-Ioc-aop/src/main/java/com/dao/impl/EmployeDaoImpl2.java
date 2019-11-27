package com.dao.impl;

import com.dao.EmployeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;

@Repository

public class EmployeDaoImpl2 implements EmployeDao {

    @Override
    public void udate() {
        System.out.println("update 222---");
    }
}

package com.dao.impl;

import com.dao.EmployeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.DuplicateFormatFlagsException;

@Repository
public class EmployeDaoImpl implements EmployeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert() {
        String sql = "insert into employe(username) values('jdbc')";
        jdbcTemplate.update(sql);
    }
}

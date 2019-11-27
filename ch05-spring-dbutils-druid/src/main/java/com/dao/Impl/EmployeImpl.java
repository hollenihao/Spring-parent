package com.dao.Impl;

import com.dao.EmployeDao;
import com.entity.Employe;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class EmployeImpl implements EmployeDao{

        private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public Employe getById() {
       String sql = "select id,username from employe where id=3";

        BeanHandler<Employe> handler = new BeanHandler<>(Employe.class);
        Employe employe = null;

        try {
            employe = queryRunner.query(sql,handler);
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException("query failed...");
        }
        return employe;
    }
}

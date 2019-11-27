package com.dao;

import com.entity.Employe;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeDao {
    void insert();

    List<Employe> getAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

}

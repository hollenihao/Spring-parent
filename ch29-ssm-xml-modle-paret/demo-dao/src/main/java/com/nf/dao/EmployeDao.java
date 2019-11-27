package com.nf.dao;

import com.nf.entity.Employe;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeDao {
    void insert(Employe employe);
    List<Employe> getAll(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize );
    void deleteById(int id);
}

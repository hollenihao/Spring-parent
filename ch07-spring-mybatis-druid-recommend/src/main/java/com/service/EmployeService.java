package com.service;

import com.entity.Employe;

import java.util.List;

public interface EmployeService {
   List<Employe> getAll(int pageNum,int pageSize);
}

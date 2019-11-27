package com.nf.service;

import com.nf.entity.Employe;

import java.util.List;

public interface EmployeService {
    List<Employe> getAll(int pageNum, int pageSize);
     void isnert(Employe employe);

}

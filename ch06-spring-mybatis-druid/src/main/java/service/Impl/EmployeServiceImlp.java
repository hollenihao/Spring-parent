package service.Impl;

import dao.EmployeDao;
import entity.Employe;
import service.EmployeService;

public class EmployeServiceImlp implements EmployeService {
    private EmployeDao dao;

    public void setDao(EmployeDao dao) {
        this.dao = dao;
    }


    @Override
    public Employe getById() {
        return dao.getById();
    }
}

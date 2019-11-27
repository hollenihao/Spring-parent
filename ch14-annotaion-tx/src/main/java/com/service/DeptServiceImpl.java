package com.service;

import com.dao.DeptDao;
import com.dao.EmployeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptServiceImpl {
    private DeptDao deptDao;
    private EmployeDao employeDao;


    public DeptServiceImpl(DeptDao deptDao, EmployeDao employeDao) {
        this.deptDao = deptDao;
        this.employeDao = employeDao;
    }
//        不能读取
    @Transactional(readOnly = false)
    public void txDemo(){
//        先删除事务是否回滚，在添加
        deptDao.delete();
        employeDao.insert();
    }
}

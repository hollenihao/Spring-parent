package com.dao.impl;

import com.dao.EmployeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//四个注解Repository用在dao类
@Repository
//有多个相同的，它先调用,有两种方法还又一种
//@Primary
public class EmployeDaoImpl implements EmployeDao {
    @Override
    public void udate() {
        System.out.println("update employee---");
    }
}

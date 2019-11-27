package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
    public static void main(String[] args) {

        UserDao dao = new UserDao();
        dao.insert();

        ApplicationContext context = new ClassPathXmlApplicationContext("appliactionContext.xml");


    }
}

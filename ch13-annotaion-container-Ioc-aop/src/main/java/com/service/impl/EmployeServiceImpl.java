package com.service.impl;

import com.dao.EmployeDao;
import com.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.swing.*;
import java.util.List;
import java.util.Map;

//管理类bean注解 Service是在service类使用，scope（作用域）也是一样
@Service
//作用域注解,该作用域将 bean 的定义的限制在每一个 Spring IoC 容器中的一个单一实例(默认)。
@Scope("singleton")
public class EmployeServiceImpl implements EmployeService {
    /**
     * 在spring的注解方法式实现注入的能力方面，支持3个注解
     * 1.Autowired（自动注入）
     * 2.Resource（资源注入）
     * 3.Inject （注入）
     *
     * 上面三个多一样
     *
     *
     * Autowired默认是依据类型来自动装配
     * 如果有多个，用名字来找 ：@Qualfier("名字")
     *
     *Resource是通过byName（名字）进行装配，只有名字找不到才会用类型装配注入
     *
     *
     * Inject：国外用得多
     * 国内一般用Autowired
     * 后2个注解是java规范的， Autowired是spring创造的注解
     *
     *
     * Autowired 注解可以用在：
     * 字段
     * 方法上（setter方法）
     */
    @Autowired
    @Qualifier("employeDaoImpl2")
private EmployeDao dao;

//list这种方法式把所有spring管理的这种类型的bean多注入进来
//    @Autowired
//        private List<EmployeDao> employeDaoList;
//map的键必须是spring类型，用来储存bean的id（名字）
//    @Autowired
//        private Map<Spring,EmployeDao> employeDaoMap;

    @Override
    public void update() {
        dao.udate();
    }
    //初始化两个注解
//    post：之后 construction：构造函数
    @PostConstruct
    public void init(){
        System.out.println("初始化.init--");
    }
//    销毁前
    @PreDestroy
    public void destroy(){
        System.out.println("destroy 销毁 --- ");
    }

    public void displayAutowireCollectionInject(){
//        for (EmployeDao employeeDao : employeDaoList) {
//            employeeDao.udate();
//        }
//        System.out.println("---map");
//
//        for (Map.Entry<Spring, EmployeDao> entry : employeDaoMap.entrySet()) {
//            System.out.println("-----debug: entry.getKey() + \"value: \"+ entry.getValue() = "
//                    + entry.getKey() + "value: "+ entry.getValue());
//        }
    }
}

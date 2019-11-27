package com;

public class EmployeeServiceImpl {
    public void insert(){
        System.out.println("insert start**");
    }
    public void update(){
        System.out.println("update start***");
        throw new RuntimeException("ghjkl;");
    }

    public int add(int x ,int y){
        System.out.println("x+y----");
        return x+y;
    }
}

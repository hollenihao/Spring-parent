package com.service;

import org.springframework.stereotype.Service;

@Service
public class ClasService {
public int add(int x,int y){
    System.out.println("cla x cla y");
    throw new RuntimeException("re");
}

}

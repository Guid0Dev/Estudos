package com.estudos.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    
    public String helloWorld(String name){
        return "Hello WOrld " + name;
    }
}

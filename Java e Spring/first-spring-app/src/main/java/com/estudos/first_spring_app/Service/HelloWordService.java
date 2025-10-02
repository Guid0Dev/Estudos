package com.estudos.first_spring_app.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {
    public String helloWord(){
        String name = "Guilherme";
        return "Hello Word, " + name;
    }
}

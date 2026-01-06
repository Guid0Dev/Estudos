package com.estudos.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.demo.Service.HelloWorldService;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    public void HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld(){
    return helloWorldService.helloWorld("Gui");
    }
    

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id,@RequestParam(value = "filter", defaultValue = "none") String filter,@RequestBody String body){
        return "Hello World " + body.getName() + id;
    }
}

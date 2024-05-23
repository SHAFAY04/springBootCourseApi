package com.spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
public class HelloController {

    @RequestMapping("/hello")    
    public String printhello(){

        return "Hello World!";
    }

}

package com.tutorial.spring.SpringBootTutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstEndpoint {
    @RequestMapping(value="/")
    public String hello() {
        return "Hello World";
    }
}

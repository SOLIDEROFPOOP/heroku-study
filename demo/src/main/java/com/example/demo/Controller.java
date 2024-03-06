package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String hellop(){
        return "HELLO";
    }
    @GetMapping("/test")
    public String bruh(@RequestAttribute("xd") String xd){
        return xd;
    }
}

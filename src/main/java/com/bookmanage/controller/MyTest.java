package com.bookmanage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {
    @GetMapping
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello/{name}/{id}")
    public String hello1(@PathVariable("name") String username,@PathVariable("id") Integer id){
        return username+"\t"+id;
    }
    @GetMapping("/hahaha")
    public String ha(@RequestParam("name") String username){
        return username;
    }
}

package com.first_app.first_app.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test_controller {

    @RequestMapping("m")
    public static String test(){
        return "hello world";
    }

    @PostMapping("get-data")
    public static String getData(@RequestParam int num1 , @RequestParam int num2){
        int result = num1 + num2;
        return String.valueOf(result);
    }
}

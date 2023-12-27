package com.example.spring06profile.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.servlet.context-path}") //application properties or yml 파일에 있는 값을 얻어올수있다.

    String path;

    @GetMapping("/main")
    public String main(){
        System.out.println("path: "+path);
        return "hello";
    }


    @GetMapping("/tmp")
    public String tmp(){
        return "fucking successed";
    }

    @GetMapping("success")
    public String tmp2(){
        return "success";
    }



}

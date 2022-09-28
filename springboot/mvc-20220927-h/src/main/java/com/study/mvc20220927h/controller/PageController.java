package com.study.mvc20220927h.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/test1")
    public String test1(){
        return "test_page1";
    }
    @GetMapping("/test2")
    public String test2(){
        System.out.println("test2");
        return "test/test_page2";
    }

    @ResponseBody
    @GetMapping("/test3")
    public String test3(){
        return "test_page1";
    }
}

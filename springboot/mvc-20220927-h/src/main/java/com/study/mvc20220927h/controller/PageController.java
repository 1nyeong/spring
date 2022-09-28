package com.study.mvc20220927h.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/test1")
    public  String test1(){
        return "test_page1";
    }
}

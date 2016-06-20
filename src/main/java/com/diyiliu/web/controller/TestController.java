package com.diyiliu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: TestController
 * Author: DIYILIU
 * Update: 2016-06-20 13:47
 */

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("title", "Hello");
        model.addAttribute("content", "Welcome Freemarker!");

        return "hello";
    }
}

package com.leoTest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReqController {

    @ResponseBody
    @RequestMapping("/hello")
    public String requestTest(){
        return "Congratulations ! This is ur response content!";
    }
}

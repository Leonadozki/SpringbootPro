package com.leoTest.controller;


import com.leoTest.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@ResponseBody     方法返回内容作为body返回
//@Controller
@RestController     // 集合了@ResponseBody和@Controller的写法
public class ReqController {

    @Resource
    private Person person;

    @RequestMapping("/hello")
    public String requestTest(){
        return "<h1>Congratulations ! This is ur response content!</h1>\n"+person;
    }
}

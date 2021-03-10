package com.example.my.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//@RestController 를 사용하면 @ResponseBody 를 추가 할 필요가 없고, @ResponseBody 활성화 되어있음
@RestController
public class TestRestController {

    @RequestMapping(value = "/testValue", method= RequestMethod.GET)
    public String getTestValue(){
        String TestValue = "레스트 컴트롤러 테스트";
        return TestValue;
    }
}

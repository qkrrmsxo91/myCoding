package com.example.my.hello.controller;

import com.example.my.vo.TestVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeleafTest {

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model){
        TestVo testModel = new TestVo("geuntae", "박근태");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }
}

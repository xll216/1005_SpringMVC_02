package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
@RequestMapping(value = "/clazz")
public class ClazzController {

    @RequestMapping(value = "/home")
    public String home() {
        System.out.println("请求的是ClazzController类中的home方法");
        return "home";
    }
}

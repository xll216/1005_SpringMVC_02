package com.ssm.controller;

import com.ssm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@Controller
public class MainController {


    /**
     * 前端请求的处理方法
     * 格式为：public String xxx()
     * 方法名可以自定义，一般情况会跟返回的页面同名
     *
     * @RequestMapping ：声明当前方法是一个请求方法
     * 处理的路径为/home
     * 请求方法中的参数传递：
     * 1、属性传递，即通过请求方法的参数列表进行一一映射，
     * 要求参数名称必须与请求提交的参数名称一致
     **/
    @RequestMapping(value = "/home")
    public String home(String name, String pwd) {

        System.out.println(name + "  " + pwd);

        return "home";
    }

    /**
     * @ResponseBody ：声明返回的内容作为响应体返回，
     * 而不是作为页面进行视图解析
     **/
    @RequestMapping(value = "/home2")
    @ResponseBody
    public String home2(User user) {
        System.out.println(user);
        return "home";
    }

    /**
     * @RequestMapping ：可以映射多个请求路径，
     * 使用大括号包括字符串集合
     * {"/", ""}：映射起始页，代替web.xml中欢迎页的配置
     **/
    @RequestMapping(value = {"/", ""})
    public String index() {
        return "index";
    }

    /**
     * 跳转到register.jsp注册页面
     **/
    @RequestMapping("/register")
    public String pageRegister() {
        return "register";
    }


    /**
     * 处理注册表单数据的提交以及页面的跳转
     * <p>
     * 默认情况下springmvc中的控制器能处理的请求方式
     * 为get和post
     * 通过RequestMapping中的method属性配置当前方法
     * 能处理的请求方式
     * <p>
     * ModelAndView：
     * 1，设置页面默认是以转发的方式处理
     * 2，如果想设置重定向，则可以在setViewName中
     * 的参数前加关键字：redirect
     **/
    @RequestMapping(value = "/dealRegister",
            method = RequestMethod.POST)
    public ModelAndView dealRegister(
            String username,
            String password,
            String[] hobby) {
        /*1.定义一个模型视图对象，该对象可以配置数据以及页面*/
        ModelAndView mv = new ModelAndView();

        /*2.设置要转发的页面名称*/
        mv.setViewName("redirect:success");

        /*3.携带数据转发*/
        mv.addObject("name", username);
        mv.addObject("pwd", password);
        mv.addObject("hobbies", hobby);

        return mv;
    }

    @RequestMapping("/success")
    public ModelAndView success(String name,
                                String pwd,
                                String[] hobbies) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.setViewName("success");

        return mv;
    }


}

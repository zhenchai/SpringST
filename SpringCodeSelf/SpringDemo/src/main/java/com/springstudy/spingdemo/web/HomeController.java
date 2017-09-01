package com.springstudy.spingdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhenchai on 2017/9/1.
 * Description: HomeController控制器
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("HomeController is arrived!");
        return "home";
    }
}

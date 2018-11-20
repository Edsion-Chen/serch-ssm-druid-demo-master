package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger log = Logger.getLogger(UserController.class);
    @Resource
    private IUserService userService;
    @RequestMapping("/login")//测试方法
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("/user");
        User user = userService.selectUserById(1);
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping("/show")//测试方法
    public String show() {
        return "redirect:/index.jsp";
    }

}

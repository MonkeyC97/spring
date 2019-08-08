package com.monkeyc.controller;

import com.monkeyc.po.User;
import com.monkeyc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class ShowUserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/showUserList")
    public ModelAndView showUserList() throws Exception{

        List<User> userList = userService.queryUserService();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userListKey",userList);
        modelAndView.setViewName("showuser");
        return modelAndView;
    }
}

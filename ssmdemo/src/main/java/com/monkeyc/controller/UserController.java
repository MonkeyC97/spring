package com.monkeyc.controller;


import com.monkeyc.po.User;
import com.monkeyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUser")
    public ModelAndView queryUserController() throws Exception{

        List<User> userList =  userService.queryUserService();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userListKey",userList);
        modelAndView.setViewName("userlist");

        return modelAndView;
    }


    @RequestMapping("deleteStudent")
    public ModelAndView deleteUserById(User user) throws Exception {
        userService.deleteUserById(user);
        ModelAndView mav = new ModelAndView("redirect:/listUserBypage");
        return mav;
    }
}

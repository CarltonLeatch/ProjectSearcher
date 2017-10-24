package com.taskmanager.controller;

import com.taskmanager.model.User;
import com.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView model = new ModelAndView("user/list");
        List<User> list = userService.allUsers();
        model.addObject("list", list);
        return model;
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView model = new ModelAndView("user/registerForm");
        User user = new User();
        model.addObject("userForm", user);
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("userForm") User user){
        userService.saveOrUpdate(user);
        return new ModelAndView("redirect:/list");
    }
}

package com.taskmanager.rest;

import com.taskmanager.model.User;
import com.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class RestUserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String test(){
        return "This is rest test";
    }

    @RequestMapping(value = "/Userlist", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<User> list(){
        List<User> list = userService.allUsers();
        return list;
    }
}

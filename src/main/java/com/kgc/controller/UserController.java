package com.kgc.controller;

import com.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller受springmvc容器管理,可以将spring容器管理的对象注入进来
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;//注入子容器中的userService

    @RequestMapping("list")
    public String listUser(ModelMap map){
          map.put("list",userService.findAll());
          return "list";
    }
}

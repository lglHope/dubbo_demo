package com.example.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import liu.hope.entity.User;
import liu.hope.service.IuserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Authou hope
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private IuserService iuserService;

    @GetMapping("/query")
    @ResponseBody
    public User queryById(@RequestParam(name = "id") Integer id){
        User user = iuserService.queryById(id);
        return user;
    }

}

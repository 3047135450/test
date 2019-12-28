package com.bdqn.controller;

import com.bdqn.entity.User;
import com.bdqn.exceptions.CommonExecptions;
import com.bdqn.service.ManUserService;
import com.bdqn.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
public class UserController {

    @Autowired
    private ManUserService service;

    @RequestMapping(value = "/login",method = RequestMethod.POST,name="PROFILE")
    public Result Login(@RequestBody User user) throws CommonExecptions {

        return service.login(user);
    }
}

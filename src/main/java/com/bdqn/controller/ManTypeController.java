package com.bdqn.controller;

import com.bdqn.service.ManTypeService;
import com.bdqn.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ManType")
@CrossOrigin
public class ManTypeController {
    @Autowired
    private ManTypeService manTypeService;

    @RequestMapping(value = "/getListManType",method = RequestMethod.GET)
    public Result getListManType(){
        return manTypeService.getListManType();
    }
}

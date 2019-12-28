package com.bdqn.controller;

import com.bdqn.entity.Contact;
import com.bdqn.service.ContactService;
import com.bdqn.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/contact")
@CrossOrigin
public class ContactController {
    @Autowired
    private ContactService service;

    @RequestMapping(value = "/getListByContact",method = RequestMethod.POST)
    public Result getListByContact(@RequestBody Map<String,Object> map){
        return service.getListByContact(map);
    }

    @RequestMapping(value = "/saveContact",method = RequestMethod.POST)
    public Result saveContact(@RequestBody Contact contact){
        System.err.println(contact.toString());
        return service.saveContact(contact);
    }

    @RequestMapping(value = "/updateContact",method = RequestMethod.POST)
    public Result updateContact(@RequestBody Contact contact){
        System.err.println(contact.toString());
        return service.updateContact(contact);
    }

    @RequestMapping(value = "/deleteContact",method = RequestMethod.POST)
    public Result deleteContact(@RequestBody Contact contact){
        System.err.println(contact.toString());
        return service.deleteContact(contact);
    }

}

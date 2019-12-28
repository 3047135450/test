package com.bdqn.service;

import com.bdqn.entity.Contact;
import com.bdqn.utils.Result;

import java.util.List;
import java.util.Map;

public interface ContactService {

    public Result getListByContact(Map<String,Object> map);
    public Result saveContact(Contact contact);
    public Result updateContact(Contact contact);

    public Result deleteContact(Contact contact);

}

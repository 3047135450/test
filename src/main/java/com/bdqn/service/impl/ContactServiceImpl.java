package com.bdqn.service.impl;

import com.bdqn.dao.ContactMapper;
import com.bdqn.entity.Contact;
import com.bdqn.service.ContactService;
import com.bdqn.utils.PageResult;
import com.bdqn.utils.Result;
import com.bdqn.utils.ResultCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactMapper contactMapper;

    @Override
    public Result getListByContact(Map<String, Object> map) {
        int page =Integer.parseInt(map.get("page").toString());
        int size =Integer.parseInt(map.get("size").toString());
        List<Contact> listByContact = contactMapper.getListByContact((page - 1) * size, size);

        PageResult<Contact> pageResult=new PageResult<>(contactMapper.getCount(),listByContact);

        return new Result(ResultCode.SUSSESS,pageResult);
    }

    @Override
    public Result saveContact(Contact contact) {
        try{
            contact.setOperateName("张三");
            contact.setOperateDateTime(new Date());
            contactMapper.insert(contact);
            return new Result(ResultCode.SUSSESS);
        }catch (Exception e){
            return new Result(ResultCode.FAIL);
        }
    }

    @Override
    public Result updateContact(Contact contact) {
        try{
            Contact contact1 = contactMapper.selectById(contact.getSerialId());
            BeanUtils.copyProperties(contact,contact1);
            contactMapper.updateById(contact1);

            return new Result(ResultCode.SUSSESS);
        }catch (Exception e){
            return new Result(ResultCode.FAIL);
        }
    }

    @Override
    public Result deleteContact(Contact contact) {
        try{
              contactMapper.deleteById(contact.getSerialId());
            return new Result(ResultCode.SUSSESS);
        }catch (Exception e){
            return new Result(ResultCode.FAIL);
        }
    }
}

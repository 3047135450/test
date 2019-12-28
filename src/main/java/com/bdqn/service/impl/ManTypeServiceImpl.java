package com.bdqn.service.impl;

import com.bdqn.dao.ManTypeMapper;
import com.bdqn.entity.ManType;
import com.bdqn.entity.User;
import com.bdqn.exceptions.CommonExecptions;
import com.bdqn.service.ManTypeService;
import com.bdqn.service.ManUserService;
import com.bdqn.utils.PageResult;
import com.bdqn.utils.Result;
import com.bdqn.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManTypeServiceImpl implements ManTypeService {
    @Autowired
    private ManTypeMapper manTypeMapper;



    @Override
    public Result getListManType() {
        List<ManType> manTypes = manTypeMapper.selectList(null);
        return new Result(ResultCode.SUSSESS,manTypes);
    }
}

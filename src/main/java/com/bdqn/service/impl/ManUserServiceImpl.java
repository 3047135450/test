package com.bdqn.service.impl;

import com.bdqn.dao.ManUserMapper;
import com.bdqn.entity.User;
import com.bdqn.exceptions.CommonExecptions;
import com.bdqn.service.ManUserService;
import com.bdqn.utils.JwtUtils;
import com.bdqn.utils.Result;
import com.bdqn.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManUserServiceImpl implements ManUserService {

    @Autowired
    private ManUserMapper userMapper;

    @Override
    public Result login(User user) throws CommonExecptions {
        User target = userMapper.getOneUser(user.getUsername(), user.getPassword());

        if (target == null) throw new CommonExecptions(ResultCode.LOGIN_USER_NOT_ENABLE_STATE);
        String token = JwtUtils.createJwt(target.getId(), target.getUsername(),null);

        return new Result(ResultCode.SUSSESS,token);
    }
}

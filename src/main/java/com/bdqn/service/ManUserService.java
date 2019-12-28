package com.bdqn.service;

import com.bdqn.entity.User;
import com.bdqn.exceptions.CommonExecptions;
import com.bdqn.utils.Result;

public interface ManUserService {

    public Result login(User user) throws CommonExecptions;
}

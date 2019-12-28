package com.bdqn.exceptions;


import com.bdqn.utils.ResultCode;
import lombok.Getter;

@Getter

public class CommonExecptions extends Exception {
    private ResultCode resultCode;
    public CommonExecptions(ResultCode resultCode){
        this.resultCode=resultCode;
    }
}

package com.bdqn.utils;

import lombok.Data;

@Data
public class Result {
    private boolean success;
    private String message;
    private int code;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(ResultCode code){
        this.success=code.success;
        this.code=code.code;
        this.message=code.message;
    }
    public Result(ResultCode code, Object data){
        this.success=code.success;
        this.code=code.code;
        this.message=code.message;
        this.data=data;
    }
    public static Result SUCCESS(){
        return new Result(ResultCode.SUSSESS);
    }
    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }
}

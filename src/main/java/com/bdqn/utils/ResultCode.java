package com.bdqn.utils;

public enum  ResultCode {
    SUSSESS(true,10000,"恭喜你，操作成功"),
    FAIL(false,10001,"操作失败，请检查你的网络"),
    LOGIN_USER_NOT_STATE(false,80088,"登录用户不存在或密码或账号错误"),
    UNAUTHORISE(false,80091,"权限不足"),
    UNAUTHENTICATED(false,10002,"您还未登录"),
    INTERCEPTOR_EXCEPTION(false,80087,"对不起"),
    SERVICE_IS_DOWN(false,80087,"服务已降级"),
    SERVICE_IS_RATE_LIMIT(false,80087,"服务已限流"),
    LOGIN_USER_NOT_ENABLE_STATE(false,80089,"请输入正确的账号或密码"),
    NO_EXIST_PERMISSION(false,80090,"权限不足");

    int code;
    String message;
    boolean success;
    ResultCode(boolean success ,int code ,String message){
        this.code=code;
        this.message=message;
        this.success=success;
    }
    public int code(){
        return code;
    }
    public String message(){
        return message;
    }
    public boolean success(){
        return success;
    }
}

package com.bdqn.interceptor;



import com.bdqn.exceptions.CommonExecptions;

import com.bdqn.utils.JwtUtils;
import com.bdqn.utils.ResultCode;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@SuppressWarnings("all")
public class JwtInterceptor extends HandlerInterceptorAdapter {

    private JwtUtils jwtUtils;

    /**执行控制器方法之前执行的方法*/
    @Override //前置拦截
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        try {
            response.setHeader("Access-Control-Allow-Origin","*");
            response.setHeader("Access-Control-Allow-Headers","Content-Type,Content-Length,Authorization,Accept,X-Requested-With");
            response.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");//OPTIONS请求的意思是浏览器发出的,用于检索复杂跨域请求
            String method = request.getMethod();
//            System.out.println("======="+method);
//            int i=1;
            if(method.equals("OPTIONS")){
//                i++;
//                System.out.println("1");
                response.setStatus(200);
                return false;
            }
            //通过request域获取请求头中的token信息
            String authorization = request.getHeader("Authorization");
////            String authorization = request.getParameter("Authorization");
//            System.err.println(authorization);
            if(!StringUtils.isEmpty(authorization) && authorization.startsWith("Bearer")){
                //获取token数据
                String token = authorization.replace("Bearer ","");
                return true;

            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        throw new CommonExecptions(ResultCode.INTERCEPTOR_EXCEPTION);
    }
}

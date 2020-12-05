package com.atguigu.servicebase.exceptionhandler;

import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("执行全局异常处理");
    }

    @ExceptionHandler(GuLiException.class)
    @ResponseBody
    public R error(GuLiException e){
        e.printStackTrace();
        return R.error().code(e.getCode()).message(e.getMsg());
    }
}

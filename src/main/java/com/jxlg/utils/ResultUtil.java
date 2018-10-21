package com.jxlg.utils;

import com.jxlg.enums.ResultEnum;
import com.jxlg.pojo.Result;

/**
 * Created by Administrator on 2018/11/17.
 */
public class ResultUtil {
    private static Result result;
    public static<T> Result success(T data){
        result = new Result<T>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }


    public static Result failed(){
        result = new Result();
        result.setCode(ResultEnum.FAILED.getCode());
        result.setMessage(ResultEnum.FAILED.getMessage());
        return result;
    }


    public static<T> Result failed(T data){
        result = new Result<T>();
        result.setCode(ResultEnum.FAILED.getCode());
        result.setMessage(ResultEnum.FAILED.getMessage());
        result.setData(data);
        return result;
    }
}

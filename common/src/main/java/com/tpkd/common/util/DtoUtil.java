package com.tpkd.common.util;

import com.tpkd.common.dto.Dto;
import org.springframework.stereotype.Component;

@Component
public class DtoUtil {

    private static String SUCCESS = "true";
    private static String FAILED = "false";

    //0为正常 ，其他为错误
    private static String CODE = "0";


    //不带参
    public static Dto getSuccess(){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.SUCCESS);
        return dto;
    }


    //不带数据的
    public static Dto getSuccess(String message){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.SUCCESS);
        dto.setErrorCode(DtoUtil.CODE);
        dto.setMsg(message);
        return dto;
    }



    //带数据和信息
    public static Dto getSuccess(String message,Object data){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.SUCCESS);
        dto.setErrorCode(DtoUtil.CODE);
        dto.setMsg(message);
        dto.setData(data);
        return dto;
    }



    //只带数据
    public static Dto getSuccess(Object data){
        Dto dto = new Dto();
        dto.setSuccess(DtoUtil.SUCCESS);
        dto.setErrorCode(DtoUtil.CODE);
        dto.setData(data);
        return dto;
    }





    //错误Dto
    public static Dto getFailed(String message,String code){
        Dto dto = new Dto();
        dto.setMsg(message);
        dto.setErrorCode(code);
        dto.setSuccess(DtoUtil.FAILED);
        return dto;
    }

}

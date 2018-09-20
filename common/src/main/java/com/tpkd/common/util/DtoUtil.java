package com.tpkd.common.util;

import com.tpkd.common.dto.Dto;
import org.springframework.stereotype.Component;

@Component
public class DtoUtil {
    public Dto returnSuccess(String message,Object obj){
        Dto dto=new Dto();
        dto.setMessage(message);
        dto.setData(obj);
        return dto;
    }
    public Dto returnFalse(String code,String message){
        Dto dto=new Dto();
        dto.setCode(code);
        dto.setMessage(message);
        dto.setSuccess("false");
        return dto;
    }
}

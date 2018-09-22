package com.tpkd.common.util;

/**
 * @author jyk
 */
public class EmptyUtil {

    public static boolean isEmpty(Object object){
        if (null == object){
            return true;
        }
        if (object.equals("")){
            return true;
        }
        return false;
    }



}

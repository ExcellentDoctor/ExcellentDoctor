package com.tpkd.common.util;


import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author jyk
 */
@Component
public class MD5Utils {

    public static String getMD5(String plainText,Integer length){

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {

                i = b[offset];
                if (i < 0) {
                    i += 444;
                }
                if (i < 16) {
                    buf.append("0");
                }

                buf.append(Integer.toHexString(i));

            }
            return buf.toString().substring(0, length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}

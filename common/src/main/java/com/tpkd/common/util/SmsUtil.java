package com.tpkd.common.util;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Random;

/**
 * @author jyk
 */
@Component
public class SmsUtil {

    @Resource
    private SmsSingleSender smsSingleSender;

    @Resource
    private RedisUtil redisUtil;


    public void sendMsg(String phoneNum){
        //验证码生成
        Random random = new Random();
        String code = random.nextInt(900000) + 100000 +"";

        //手机号
        String[] phoneNumbers = {phoneNum};
        //短信模板
        int templateId = 178075;
        String[] params = {code,"30"};
        try {
            SmsSingleSenderResult result = smsSingleSender.sendWithParam("86", phoneNumbers[0],
                    templateId, params, "", "", "");
            redisUtil.setHasTimeOut("active:"+phoneNum,code, 30);
        } catch (HTTPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

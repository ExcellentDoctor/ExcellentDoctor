package com.tpkd.common.config;


import com.github.qcloudsms.SmsSingleSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {

    @Bean
    public SmsSingleSender smsSingleSender(){
        SmsSingleSender smsSingleSender = new SmsSingleSender(1400128786,"b5ab52fc3489cb010c4f22e6dcbc3840");
        return smsSingleSender;
    }
}

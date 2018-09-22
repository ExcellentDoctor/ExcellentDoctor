package com.tpkd.consumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Question;
import com.tpkd.common.services.RpcQuestionService;
import com.tpkd.common.util.DtoUtil;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Reference
    private RpcQuestionService rpcQuestionService;
    @Override
    public Dto insertQuestion(Question question) {
        int temp=rpcQuestionService.insertQuestion(question);
        if(temp>0){
            return DtoUtil.getSuccess();
        }
        return DtoUtil.getFailed("插入问题失败","1001");
    }
}

package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.QuestionMapper;
import com.tpkd.common.pojo.Question;
import com.tpkd.common.services.RpcQuestionService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@Service(interfaceClass = RpcQuestionService.class)
public class QuestionServiceImpl implements RpcQuestionService {
    @Resource
    private QuestionMapper questionMapper;
    @Override
    public int insertQuestion(Question question) {
        return questionMapper.insertSelective(question);
    }
}

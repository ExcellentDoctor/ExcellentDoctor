package com.tpkd.consumer.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Question;

public interface QuestionService {
    Dto insertQuestion(Question question);
}

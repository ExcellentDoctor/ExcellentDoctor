package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.ClassificationMapper;
import com.tpkd.common.pojo.Classification;
import com.tpkd.common.services.RpcClassificationService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@Service(interfaceClass = RpcClassificationService.class)
public class ClassificationImpl implements RpcClassificationService{
    @Resource
    private ClassificationMapper classificationMapper;
    @Override
    public Classification selectByClassificationId(Integer classificationId) {
        return classificationMapper.selectByPrimaryKey(classificationId);
    }
}

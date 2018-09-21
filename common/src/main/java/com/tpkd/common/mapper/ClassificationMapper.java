package com.tpkd.common.mapper;

import com.tpkd.common.pojo.Classification;

public interface ClassificationMapper {
    int deleteByPrimaryKey(Integer classificationId);

    int insert(Classification record);

    int insertSelective(Classification record);

    Classification selectByPrimaryKey(Integer classificationId);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}
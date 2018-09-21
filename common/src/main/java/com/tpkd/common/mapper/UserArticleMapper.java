package com.tpkd.common.mapper;

import com.tpkd.common.pojo.UserArticle;

public interface UserArticleMapper {
    int insert(UserArticle record);

    int insertSelective(UserArticle record);
}
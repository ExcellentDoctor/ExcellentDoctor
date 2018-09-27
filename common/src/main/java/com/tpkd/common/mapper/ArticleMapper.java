package com.tpkd.common.mapper;

import com.tpkd.common.pojo.Article;
import com.tpkd.common.vo.article.ArticleTitleVo;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectByClassificationId(ArticleTitleVo articleTitleVo);
}
package com.tpkd.common.services;

import com.tpkd.common.pojo.Article;
import com.tpkd.common.vo.article.ArticleTitleVo;

import java.util.List;


public interface RpcArticleService {
    List<Article> selectByTitle(ArticleTitleVo articleTitleVo);
}

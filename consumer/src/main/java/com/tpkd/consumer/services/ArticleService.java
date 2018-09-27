package com.tpkd.consumer.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.vo.article.ArticleTitleVo;

public interface ArticleService {
    Dto selectArticle(ArticleTitleVo articleTitleVo);
}

package com.tpkd.consumer.controller;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.vo.article.ArticleTitleVo;
import com.tpkd.consumer.services.ArticleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @RequestMapping("/selectArticleByClassId")
    public Dto selectArticleByClassId(@RequestBody ArticleTitleVo articleTitleVo){
        return articleService.selectArticle(articleTitleVo);
    }
}

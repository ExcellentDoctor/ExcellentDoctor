package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.qos.command.impl.Ls;
import com.tpkd.common.mapper.ArticleMapper;
import com.tpkd.common.pojo.Article;
import com.tpkd.common.services.RpcArticleService;
import com.tpkd.common.vo.article.ArticleTitleVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = RpcArticleService.class)
public class ArticleServiceImpl implements RpcArticleService{
    @Resource
    private ArticleMapper articleMapper;
    @Override
    public List<Article> selectByTitle(ArticleTitleVo articleTitleVo) {
        return articleMapper.selectByClassificationId(articleTitleVo);
    }
}

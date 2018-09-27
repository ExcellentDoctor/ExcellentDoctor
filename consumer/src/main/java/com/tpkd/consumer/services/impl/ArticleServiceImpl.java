package com.tpkd.consumer.services.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Article;
import com.tpkd.common.pojo.Classification;
import com.tpkd.common.pojo.Doctor;
import com.tpkd.common.services.RpcArticleService;
import com.tpkd.common.services.RpcClassificationService;
import com.tpkd.common.services.RpcDoctorService;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.util.EmptyUtil;
import com.tpkd.common.vo.article.ArticleMessageVo;
import com.tpkd.common.vo.article.ArticleTitleVo;
import com.tpkd.common.vo.doctor.DoctorData;
import com.tpkd.consumer.services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Reference
    private RpcArticleService rpcArticleService;
    @Reference
    private RpcDoctorService rpcDoctorService;
    @Reference
    private RpcClassificationService rpcClassificationService;
    @Override
    public Dto selectArticle(ArticleTitleVo articleTitleVo) {

        List<Article> articles=rpcArticleService.selectByTitle(articleTitleVo);
        List<ArticleMessageVo> list=new ArrayList<>();
        for(Article article:articles) {
            if (!EmptyUtil.isEmpty(article)) {
                ArticleMessageVo articleMessageVo=new ArticleMessageVo();
                articleMessageVo.setDigest(article.getDigest());
                articleMessageVo.setReadNumber(article.getReadNumber());
                articleMessageVo.setCollectionNumber(article.getCollectionNumber());
                articleMessageVo.setTitle(article.getTitle());
                DoctorData doctor = rpcDoctorService.selectDoctorData(article.getDoctorId());
                if (!EmptyUtil.isEmpty(doctor)) {
                    articleMessageVo.setDoctorName(doctor.getDoctorName());
                    articleMessageVo.setHospitalName(doctor.getHospitalName());
                }
                StringBuffer sb = new StringBuffer();
                Classification classification1 = rpcClassificationService.selectByClassificationId(article.getClassificationIdFirstLevel());
                if (classification1 != null) {
                    sb.append(classification1.getClassificationName() + ",");
                }
                Classification classification2 = rpcClassificationService.selectByClassificationId(article.getClassificationIdSecondLevel());
                if (classification2 != null) {
                    sb.append(classification2.getClassificationName() + ",");
                }
                Classification classification3 = rpcClassificationService.selectByClassificationId(article.getClassificationIdThirdLevel());
                if (classification3 != null) {
                    sb.append(classification3.getClassificationName() + ",");
                }
                String classificationName = sb.toString().substring(0, sb.toString().lastIndexOf(","));
                articleMessageVo.setClassificationName(classificationName);
                list.add(articleMessageVo);
            }
        }
        return DtoUtil.getSuccess("成功获取到文章列表",list);
    }
}

package com.tpkd.common.pojo;

import java.io.Serializable;

public class Article implements Serializable {
    private Integer articleId;

    private Integer doctorId;

    private Integer readNumber;

    private Integer collectionNumber;

    private String title;

    private String articleValue;

    private String digest;

    private Integer classificationIdFirstLevel;

    private Integer classificationIdSecondLevel;

    private Integer classificationIdThirdLevel;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    public Integer getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(Integer collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getArticleValue() {
        return articleValue;
    }

    public void setArticleValue(String articleValue) {
        this.articleValue = articleValue == null ? null : articleValue.trim();
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public Integer getClassificationIdFirstLevel() {
        return classificationIdFirstLevel;
    }

    public void setClassificationIdFirstLevel(Integer classificationIdFirstLevel) {
        this.classificationIdFirstLevel = classificationIdFirstLevel;
    }

    public Integer getClassificationIdSecondLevel() {
        return classificationIdSecondLevel;
    }

    public void setClassificationIdSecondLevel(Integer classificationIdSecondLevel) {
        this.classificationIdSecondLevel = classificationIdSecondLevel;
    }

    public Integer getClassificationIdThirdLevel() {
        return classificationIdThirdLevel;
    }

    public void setClassificationIdThirdLevel(Integer classificationIdThirdLevel) {
        this.classificationIdThirdLevel = classificationIdThirdLevel;
    }
}
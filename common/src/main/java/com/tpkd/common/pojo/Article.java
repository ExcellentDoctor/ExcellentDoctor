package com.tpkd.common.pojo;

public class Article {
    //文章id
    private int articleId;
    //医生id
    private int doctorId;
    //阅读数量
    private int readNumber;
    //收藏数量
    private int collectionNumber;
    //标题
    private String title;
    //内容
    private String articleValue;
    //摘要
    private String digest;
    //一级标题
    private int classificationIdFirstLevel;
    //二级标题
    private int classificationIdSecondLevel;
    //三级标题
    private int classificationIdThirdLevel;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticleValue() {
        return articleValue;
    }

    public void setArticleValue(String articleValue) {
        this.articleValue = articleValue;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public int getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(int collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public int getClassificationIdFirstLevel() {
        return classificationIdFirstLevel;
    }

    public void setClassificationIdFirstLevel(int classificationIdFirstLevel) {
        this.classificationIdFirstLevel = classificationIdFirstLevel;
    }

    public int getClassificationIdSecondLevel() {
        return classificationIdSecondLevel;
    }

    public void setClassificationIdSecondLevel(int classificationIdSecondLevel) {
        this.classificationIdSecondLevel = classificationIdSecondLevel;
    }

    public int getClassificationIdThirdLevel() {
        return classificationIdThirdLevel;
    }

    public void setClassificationIdThirdLevel(int classificationIdThirdLevel) {
        this.classificationIdThirdLevel = classificationIdThirdLevel;
    }
}

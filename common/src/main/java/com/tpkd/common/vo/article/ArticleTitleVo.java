package com.tpkd.common.vo.article;

import java.io.Serializable;

public class ArticleTitleVo implements Serializable {
    private Integer classificationIdFirstLevel;
    private Integer classificationIdSecondLevel;
    private Integer classificationIdThirdLevel;

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

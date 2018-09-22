package com.tpkd.consumer.controller;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Image;
import com.tpkd.common.pojo.Question;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.util.UploadUtil;
import com.tpkd.consumer.services.ImageService;
import com.tpkd.consumer.services.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class QuestionController {
    @Resource
    private ImageService imageService;
    @Resource
    private QuestionService questionService;
    @Resource
    private UploadUtil uploadUtil;
    @RequestMapping("/upload")
    public Dto askquestion(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        Image image = new Image();
        if (null != file) {
            String path = request.getSession().getServletContext().getRealPath("/statics" + File.separator + "upload");
            String imageUrl=uploadUtil.getUrl(file,path);
            if(imageUrl.equals("notok")){
                return DtoUtil.getFailed("上传格式错误","1001");
            }
            image.setImageUrl(imageUrl);
        }
        return imageService.insertImage(image);
    }
    @RequestMapping(value = "/askQuestion",method = RequestMethod.POST)
    public Dto ask(@RequestParam("questionValue")String questionValue,@RequestParam(value = "imageId",required = false)Integer imageId,HttpServletRequest request){
        String token=request.getHeader("token");
        Question question=new Question();
        if(token!=null){
            token=token.split("-")[2];
            question.setUserId(Integer.valueOf(token));
        }
        question.setQuestionValue(questionValue);
        if(imageId!=null){
            question.setImageId(imageId);
        }
        return  questionService.insertQuestion(question);
    }
}

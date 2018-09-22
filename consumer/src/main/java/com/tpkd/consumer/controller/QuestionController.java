package com.tpkd.consumer.controller;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Image;
import com.tpkd.common.util.UploadUtil;
import com.tpkd.consumer.services.ImageService;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private UploadUtil uploadUtil;
    @RequestMapping("/upload")
    public Dto askquestion(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        Image image = new Image();
        if (null != file) {
            String path = request.getSession().getServletContext().getRealPath("/statics" + File.separator + "upload");
            image.setImageUrl(uploadUtil.getUrl(file,path));
        }
        return imageService.insertImage(image);
    }
}

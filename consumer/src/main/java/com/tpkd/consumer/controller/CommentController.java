package com.tpkd.consumer.controller;


import com.tpkd.common.dto.Dto;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.consumer.services.CommentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author jyk
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;


    @RequestMapping("/findCommentByDoctorId/{doctorId}")
    public Dto findCommentByDoctorId(@PathVariable Integer doctorId){
        Map map = commentService.getCommentMsg(doctorId);
        return DtoUtil.getSuccess(map);
    }


}

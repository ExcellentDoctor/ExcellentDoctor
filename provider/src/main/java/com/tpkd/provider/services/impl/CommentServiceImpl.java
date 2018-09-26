package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.CommentMapper;
import com.tpkd.common.pojo.Comment;
import com.tpkd.common.services.RpcCommentService;
import com.tpkd.common.services.RpcDepartmentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
@Service(interfaceClass = RpcCommentService.class)
public class CommentServiceImpl implements RpcCommentService {

    @Resource
    private CommentMapper commentMapper;



    @Override
    public Integer getTotalCount(Integer doctorId) {
        return commentMapper.getTotalCountByDoctorId(doctorId);
    }

    @Override
    public List<Comment> getAllComment(Integer doctorId) {
        return commentMapper.getAllCommentByDoctorId(doctorId);
    }
}

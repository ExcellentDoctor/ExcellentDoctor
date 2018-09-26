package com.tpkd.common.services;

import com.tpkd.common.pojo.Comment;

import java.util.List;

public interface RpcCommentService {

    Integer getTotalCount(Integer doctorId);

    List<Comment> getAllComment(Integer doctorId);

}

package com.tpkd.common.mapper;

import com.tpkd.common.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    Integer getTotalCountByDoctorId(Integer doctorId);

    List<Comment> getAllCommentByDoctorId(Integer doctorId);
}
package com.tpkd.consumer.services.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.pojo.Comment;
import com.tpkd.common.pojo.User;
import com.tpkd.common.services.RpcCommentService;
import com.tpkd.common.services.RpcUserService;
import com.tpkd.common.vo.comment.CommentListVo;
import com.tpkd.consumer.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author jyk
 */

@Service
public class CommentServiceImpl implements CommentService {


    @Reference
    private RpcUserService rpcUserService;

    @Reference
    private RpcCommentService rpcCommentService;



    @Override
    public Map getCommentMsg(Integer doctorId) {
        Map map = new HashMap();
        Integer totalCount = rpcCommentService.getTotalCount(doctorId);
        map.put("totalCount",totalCount);
        List<Comment> commentList = rpcCommentService.getAllComment(doctorId);

        List<CommentListVo> commentListVoList  = new LinkedList<>();
        for (Comment cl : commentList) {
            CommentListVo commentListVo = new CommentListVo();
            commentListVo.setComment(cl);
            User user = rpcUserService.findById(cl.getUserId());
            commentListVo.setUser(user);
            commentListVoList.add(commentListVo);
        }
        map.put("commentMsg",commentListVoList);
        return map;
    }
}

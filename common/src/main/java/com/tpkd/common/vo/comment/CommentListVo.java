package com.tpkd.common.vo.comment;

import com.tpkd.common.pojo.Comment;
import com.tpkd.common.pojo.User;

import java.io.Serializable;

public class CommentListVo implements Serializable {

    private User user;

    private Comment comment;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}

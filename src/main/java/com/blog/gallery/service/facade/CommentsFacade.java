package com.blog.gallery.service.facade;

import com.blog.gallery.entity.Comment;
import com.blog.gallery.entity.Post;

public interface CommentsFacade {
    void addComment(Post post, Comment comment);
}

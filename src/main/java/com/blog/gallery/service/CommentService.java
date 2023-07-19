package com.blog.gallery.service;

import com.blog.gallery.entity.Comment;
import com.blog.gallery.entity.Post;

public interface CommentService {

    void addComment(Post post, Comment comment);
}

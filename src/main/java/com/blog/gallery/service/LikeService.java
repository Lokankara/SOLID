package com.blog.gallery.service;

import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;

public interface LikeService {
    void likePost(Post post, User liker);
}

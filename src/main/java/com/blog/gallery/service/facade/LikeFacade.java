package com.blog.gallery.service.facade;

import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;

public interface LikeFacade {
    void likePost(Post post, User liker);
}

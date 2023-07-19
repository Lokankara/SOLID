package com.blog.gallery.service;

import com.blog.gallery.entity.Picture;
import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;

public interface PublishingService {
    public Post publishPost(User user, Picture picture);
}

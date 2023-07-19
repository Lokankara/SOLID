package com.blog.gallery.service.filter;

import com.blog.gallery.entity.User;
import com.blog.gallery.service.filter.Filter;
import com.blog.gallery.entity.Picture;

import java.util.List;

public interface PrepareService {
    Picture prepare(Picture picture, List<Filter> filters);

    void publishPost(User user, Picture prepared);
}

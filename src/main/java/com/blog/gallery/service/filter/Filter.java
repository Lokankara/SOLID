package com.blog.gallery.service.filter;

import com.blog.gallery.entity.Picture;

public interface Filter {
    Picture apply(Picture source);
}

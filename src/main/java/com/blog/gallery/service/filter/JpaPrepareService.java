package com.blog.gallery.service.filter;

import com.blog.gallery.entity.Picture;
import com.blog.gallery.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaPrepareService implements PrepareService {
    @Override
    public Picture prepare(Picture source, List<Filter> filters) {
        Picture prepared = source;
        for (Filter filter : filters) {
            prepared = filter.apply(prepared);
        }
        return prepared;
    }

    @Override
    public void publishPost(User user, Picture prepared) {

    }
}

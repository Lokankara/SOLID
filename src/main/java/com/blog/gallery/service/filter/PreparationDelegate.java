package com.blog.gallery.service.filter;

import com.blog.gallery.entity.Picture;
import com.blog.gallery.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PreparationDelegate {
    private final PrepareService preparationService;

    public void runPreparation(User user, Picture picture) {
        List<Filter> filters = Arrays.asList(
                new ClarendonFilter(),
                new MoonFilter()
        );
        Picture prepared = preparationService.prepare(picture, filters);
        preparationService.publishPost(user, prepared);
    }
}

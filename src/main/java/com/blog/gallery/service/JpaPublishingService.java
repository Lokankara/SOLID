package com.blog.gallery.service;

import com.blog.gallery.entity.Picture;
import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class JpaPublishingService implements PublishingService {

    private final PostService postService;

    @Override

    public Post publishPost(User author, Picture picture) {
        Post post = Post.builder()
                .picture(picture)
                .author(author)
                .publishedDate(LocalDate.now())
                .build();
        return postService.save(post);
    }
}

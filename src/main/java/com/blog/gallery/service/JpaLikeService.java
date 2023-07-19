package com.blog.gallery.service;

import com.blog.gallery.entity.Like;
import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;
import com.blog.gallery.repository.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaLikeService implements LikeService {

    private final LikeRepository likeRepository;

    @Override

    public void likePost(Post post, User liker) {
        likeRepository.save(Like.builder().post(post).liker(liker).build());
    }
}

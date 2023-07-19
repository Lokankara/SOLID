package com.blog.gallery.service;

import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    List<Post> findAllByUser(User user);

    List<Post> findRecommendations(User user);

    Post findPostById(Long id);

    Post save(Post post);

    Post update(Long id, Post post);

    void delete(Long id);
}

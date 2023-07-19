package com.blog.gallery.service;

import com.blog.gallery.entity.Comment;
import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;
import com.blog.gallery.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JpaPostService implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> findAllByUser(User user) {
        return postRepository.findAllByAuthor(user);
    }

    @Override
    public List<Post> findRecommendations(User user) {
        return findAllByUser(user).stream()
                .flatMap(post -> post.getComments().stream())
                .map(Comment::getAuthor)
                .flatMap(commentAuthor -> findAllByUser(commentAuthor)
                        .stream()
                        .limit(5))
                .toList();
    }

    @Override
    public Post findPostById(Long id) {
        return findPostById(id);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post update(Long id, Post post) {
        Post postById = findPostById(id); //TODO
        return save(post);
    }

    @Override
    public void delete(Long id) {
        Post post = findPostById(id);
        postRepository.delete(post);
    }
}

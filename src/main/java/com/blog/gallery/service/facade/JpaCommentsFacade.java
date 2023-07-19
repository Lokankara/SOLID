package com.blog.gallery.service.facade;

import com.blog.gallery.service.notification.CommentNotification;
import com.blog.gallery.entity.Comment;
import com.blog.gallery.entity.Post;
import com.blog.gallery.service.CommentService;
import com.blog.gallery.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JpaCommentsFacade implements CommentsFacade {
    private final CommentService commentService;
    private final NotificationService notificationService;
    @Override
    public void addComment(Post post, Comment comment) {
        commentService.addComment(post, comment);
        notificationService.sendNotification(
                new CommentNotification(post, comment));
    }
}

package com.blog.gallery.service.facade;

import com.blog.gallery.entity.Post;
import com.blog.gallery.entity.User;
import com.blog.gallery.service.LikeService;
import com.blog.gallery.service.notification.LikeNotification;
import com.blog.gallery.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JpaLikeFacade implements LikeFacade {

    private final LikeService likeService;
    private final NotificationService notificationService;

    @Override
    public void likePost(Post post, User liker) {
        likeService.likePost(post, liker);
        post.getLikeNotificationRecipients()
                .stream()
                .map(recipient -> new LikeNotification(recipient, liker))
                .forEach(notificationService::sendNotification);
    }
}

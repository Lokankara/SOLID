package com.blog.gallery.service.notification;

public interface NotificationService {
    void sendNotification(CommentNotification commentNotification);

    void sendNotification(FriendshipNotification friendshipNotification);

    void sendNotification(LikeNotification likeNotification);
}

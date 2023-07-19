package com.blog.gallery.service.facade;

import com.blog.gallery.entity.User;
import com.blog.gallery.service.friend.FriendshipService;
import com.blog.gallery.service.notification.FriendshipNotification;
import com.blog.gallery.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaFriendshipFacade implements FriendshipFacade {
    private final FriendshipService friendshipService;
    private final NotificationService notificationService;

    @Override
    public void addToFriends(User user, User friend) {
        friendshipService.addToFriends(user, friend);
        notificationService.sendNotification(
                new FriendshipNotification(user, friend));
    }
}

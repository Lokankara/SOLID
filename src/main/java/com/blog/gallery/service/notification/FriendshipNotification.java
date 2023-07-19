package com.blog.gallery.service.notification;

import com.blog.gallery.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FriendshipNotification implements Notification {
    private User user;
    private User friend;
}

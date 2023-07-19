package com.blog.gallery.service.notification;

import com.blog.gallery.entity.User;

import java.util.List;

public interface HasLikeNotificationRecipients {
    List<User> getLikeNotificationRecipients();
}

package com.blog.gallery.service.facade;

import com.blog.gallery.entity.User;

public interface FriendshipFacade {
    void addToFriends(User user, User friend);
}

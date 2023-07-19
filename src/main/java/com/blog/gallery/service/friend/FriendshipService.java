package com.blog.gallery.service.friend;

import com.blog.gallery.entity.User;

public interface FriendshipService {

    void addToFriends(User user, User friend);
}

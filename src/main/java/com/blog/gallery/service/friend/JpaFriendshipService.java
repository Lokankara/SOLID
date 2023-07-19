package com.blog.gallery.service.friend;

import com.blog.gallery.entity.User;
import com.blog.gallery.repository.FriendshipRepository;
import com.blog.gallery.service.facade.JpaFriendshipFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaFriendshipService implements FriendshipService {
//    private final JpaFriendshipFacade friendshipFacade;
    private final FriendshipRepository friendshipRepository;

    @Override
    public void addToFriends(User user, User friend) {
        friendshipRepository.save(Friendship.builder().friend(friend).user(user).build());
        friendshipRepository.save(Friendship.builder().friend(user).user(friend).build());
    }
}

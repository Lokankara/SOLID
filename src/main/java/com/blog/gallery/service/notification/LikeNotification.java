package com.blog.gallery.service.notification;

import com.blog.gallery.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeNotification implements Notification {
    private User author;
    private User liker;

}

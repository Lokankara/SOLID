package com.blog.gallery.service.notification;

import com.blog.gallery.entity.Comment;
import com.blog.gallery.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CommentNotification {
    private Post post;
    private Comment comment;
}

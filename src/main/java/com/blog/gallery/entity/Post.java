package com.blog.gallery.entity;

import com.blog.gallery.service.notification.HasLikeNotificationRecipients;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post implements HasLikeNotificationRecipients {

    @Id
    private Long postId;
    private LocalDate publishedDate;
    private int likes;

    @OneToOne
    private Picture picture;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @Override
    public List<User> getLikeNotificationRecipients() {
        return Collections.singletonList(getAuthor());
    }
}

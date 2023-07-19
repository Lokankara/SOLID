package com.blog.gallery.service.friend;

import com.blog.gallery.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Friendship {
    @Id
    private Long id;
    @ManyToOne
    private User user;

    @ManyToOne
    private User friend;
}

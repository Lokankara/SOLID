package com.blog.gallery.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    private Long userId;
    private String name;
    private String email;
    @OneToOne
    private Picture avatar;
    @OneToMany(mappedBy = "author")
    private List<Post> posts;
}

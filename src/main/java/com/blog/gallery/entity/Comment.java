package com.blog.gallery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    private Long commentId;
    private String text;
    private Date published;
    @ManyToOne
    private User author;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}

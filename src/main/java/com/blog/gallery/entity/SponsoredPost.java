package com.blog.gallery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class SponsoredPost extends Post {
    private User sponsor;

    @Override
    public List<User> getLikeNotificationRecipients() {
        return Arrays.asList(getAuthor(), getSponsor());
    }
}

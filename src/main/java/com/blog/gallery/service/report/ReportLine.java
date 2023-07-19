package com.blog.gallery.service.report;

import com.blog.gallery.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReportLine {
    private Post post;
    private int likesCount;
}

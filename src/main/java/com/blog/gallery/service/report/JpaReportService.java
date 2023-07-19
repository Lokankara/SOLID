package com.blog.gallery.service.report;

import com.blog.gallery.entity.User;
import com.blog.gallery.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JpaReportService implements ReportService {

    private final PostService postService;

    @Override
    public Report buildReport(User user) {
        List<ReportLine> reportLines = postService
                .findAllByUser(user)
                .stream()
                .map(post -> new ReportLine(post, post.getLikes()))
                .toList();
        return new Report(reportLines);
    }

    @Override
    public Report buildSponsoredReport(User user) {
        List<ReportLine> reportLines = postService
                .findAllByUser(user)
                .stream()
                .map(post -> new ReportLine(post, post.getLikes()))
                .toList();
        return new Report(reportLines);
    }
}

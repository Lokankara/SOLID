package com.blog.gallery.service.report;

import com.blog.gallery.entity.User;

public interface ReportService {
    Report buildReport(User user);

    Report buildSponsoredReport(User user);
}

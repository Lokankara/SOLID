package com.blog.gallery.service.report;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Report {

    private List<ReportLine> lines;
}

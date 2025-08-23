package com.job.macher.resume.analyzer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analyze")
public class ResumeAnalyzerController {

    @PostMapping
    public String analyzeResume() {
        return "Analyzed";
    }
}

package com.example.demo.viewmodel;

import java.util.List;

public record ServicePageViewModel(
        String title,
        String serviceName,
        String serviceDescription,
        List<FeedbackViewModel> feedback) {
}

package com.example.demo.viewmodel;

import java.util.List;

public record ServicesPageViewModel(
        String title,
        List<String> services,
        List<String> categories) {
}

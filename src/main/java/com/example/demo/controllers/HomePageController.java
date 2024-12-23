package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.viewmodel.pages.HomeViewModel;

@RequestMapping("/")
public interface HomePageController {

    @GetMapping
    HomeViewModel getHomePageViewModel();
}

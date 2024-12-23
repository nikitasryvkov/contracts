package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.viewmodel.user.UserProfileViewModel;

@RequestMapping("/profile")
public interface UserProfileController {

    @GetMapping
    UserProfileViewModel getUserProfileViewModel();
}

package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

public interface RatingController {

    @GetMapping("/all")
    String showAllRating(Model model);
}

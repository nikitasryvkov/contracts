package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.viewmodel.ServicePageViewModel;

@RequestMapping("/service")
public interface ServicePageController {

    @GetMapping("/{serviceId}")
    ServicePageViewModel geServicePageViewModel(@PathVariable Integer serviceId);
}

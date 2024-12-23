package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.forms.ServiceInputModel;
import com.example.demo.viewmodel.ServicesPageViewModel;

@RequestMapping("/services")
public interface ServicesPageController {

    @GetMapping
    ServicesPageViewModel getServicesPageViewModel(@ModelAttribute ServiceInputModel service);
}

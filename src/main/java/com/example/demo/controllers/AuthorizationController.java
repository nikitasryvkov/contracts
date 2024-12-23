package com.example.demo.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.forms.LoginInputModel;
import com.example.demo.forms.RegistrationInputModel;

import ch.qos.logback.core.model.Model;

@RequestMapping("/auth")
public interface AuthorizationController {

    @PostMapping("/login")
    String login(@ModelAttribute("login") LoginInputModel login, Model model);

    @PostMapping("/registration")
    String registration(@ModelAttribute("registration") RegistrationInputModel registration, Model model);
}

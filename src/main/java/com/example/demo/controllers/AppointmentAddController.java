package com.example.demo.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.forms.AppointmentInputModel;

import ch.qos.logback.core.model.Model;

@RequestMapping("/appointment")
public interface AppointmentAddController {

    @PostMapping
    String addAppointment(@ModelAttribute("appointment") AppointmentInputModel appointment, Model model);
}

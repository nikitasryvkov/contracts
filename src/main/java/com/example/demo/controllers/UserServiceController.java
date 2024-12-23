package com.example.demo.controllers;

import com.example.demo.forms.UserServiceCreateForm;
import com.example.demo.forms.UserServiceUpdateForm;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

public interface UserServiceController {

    @GetMapping("/all")
    String showAllUserService(Model model);

    @GetMapping("/{id}/status")
    String changeStatusUserService(@PathVariable("id") UUID id);

    @GetMapping("/create")
    String createUserService(Model model);

    @PostMapping("/create")
    String createUserService(@Valid @ModelAttribute("form") UserServiceCreateForm form, BindingResult bindingResult,
            Model model);

    @GetMapping("/{id}/update")
    String updateUserService(@PathVariable("id") UUID id, Model model);

    @PostMapping("/{id}/update")
    String updateUserService(@Valid @PathVariable("id") UUID id, @ModelAttribute("form") UserServiceUpdateForm form,
            BindingResult bindingResult, Model model);
}

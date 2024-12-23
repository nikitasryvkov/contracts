package com.example.demo.controllers.done;

import com.example.demo.forms.done.UserRegistrationForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/registration")
public interface RegistrationController extends BaseController {

    @GetMapping
    String registrationUserForm(Model model);

    @PostMapping
    String registrationUser(@Valid @ModelAttribute("form") UserRegistrationForm form, BindingResult bindingResult,
            Model model);

}

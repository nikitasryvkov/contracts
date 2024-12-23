package com.example.demo.controllers.done;

import com.example.demo.forms.done.UserProfileUpdateForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

public interface UserController extends BaseController {

    @GetMapping("/{id}")
    String getUser(Principal principal, Model model);

    @GetMapping("/{id}/update")
    String updateUserForm(Principal principal, Model model);

    @PostMapping("/{id}/update")
    String updateUser(Principal principal, @Valid @ModelAttribute("form") UserProfileUpdateForm form,
            BindingResult bindingResult, Model model);
}

package com.example.demo.controllers.done;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public interface LoginController extends BaseController {

    @GetMapping
    String loginUserForm(Model model);
}

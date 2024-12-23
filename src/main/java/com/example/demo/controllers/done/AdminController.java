package com.example.demo.controllers.done;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface AdminController extends BaseController {

    @GetMapping("/")
    String adminPage(Model model);
}

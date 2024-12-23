package com.example.demo.controllers.done;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface HomeController extends BaseController {

    @GetMapping("/")
    String homePage(Model model);
}

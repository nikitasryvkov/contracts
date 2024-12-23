package com.example.demo.controllers.done;

import org.springframework.web.bind.annotation.GetMapping;

public interface FaqController extends BaseController {

    @GetMapping("/")
    String getFaqPage();
}

package com.example.demo.controllers.done;

import java.security.Principal;
import java.util.UUID;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.forms.done.FeedbackCreateForm;
import com.example.demo.forms.done.FeedbackUpdateForm;

import jakarta.validation.Valid;

@RequestMapping("/feedback")
public interface FeedbackController extends BaseController {

    @GetMapping("/{id}")
    String getFeedback(@PathVariable("id") UUID id, Model model);

    @GetMapping("/all")
    String getFeedbacks(Principal principal, Model model);

    @GetMapping("/all/master")
    String getFeedbacksMaster(Principal principal, Model model);

    @GetMapping("/all/admin")
    String getFeedbacksAdmin(Model model);

    @GetMapping("/create")
    String createFeedbackForm(Principal principal, Model model);

    @PostMapping("/create")
    String createFeedback(Principal principal, @Valid @ModelAttribute("form") FeedbackCreateForm form,
            BindingResult bindingResult, Model model);

    @GetMapping("/{id}/update")
    String updateFeedbackForm(@PathVariable("id") UUID id, Model model);

    @PostMapping("/{id}/update")
    String updateFeedback(@PathVariable("id") UUID id, @Valid @ModelAttribute("form") FeedbackUpdateForm form,
            BindingResult bindingResult, Model model);
}

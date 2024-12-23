package com.example.demo.controllers.done;

import java.util.UUID;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.forms.done.CategoryCreateForm;
import com.example.demo.forms.done.CategoryUpdateForm;

import jakarta.validation.Valid;

@RequestMapping("/category")
public interface CategoryController extends BaseController {

    @GetMapping("/all")
    String getCategory(Model model);

    @GetMapping("/create")
    String addCategoryForm(Model model);

    @PostMapping("/create")
    String addCategory(@Valid @ModelAttribute("form") CategoryCreateForm form, BindingResult bindingResult,
            Model model);

    @GetMapping("/update/{id}")
    String updateCategoryForm(@PathVariable("id") UUID id, Model model);

    @PostMapping("/update/{id}")
    String updateCategory(@PathVariable("id") UUID id, @Valid @ModelAttribute("form") CategoryUpdateForm form,
            BindingResult bindingResult, Model model);
}

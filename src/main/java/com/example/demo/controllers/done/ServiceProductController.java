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

import com.example.demo.forms.done.CategoryUpdateForm;
import com.example.demo.forms.done.ServiceProductCreateForm;
import com.example.demo.forms.done.ServiceProductUpdateForm;

import jakarta.validation.Valid;

@RequestMapping("/service")
public interface ServiceProductController extends BaseController {

    @GetMapping("/all")
    String getServiceProducts(Model model);

    @GetMapping("/all/master")
    String getServiceProductsMaster(Principal principal, Model model);

    @GetMapping("/all/admin")
    String getServiceProductsAdmin(Model model);

    @GetMapping("/{id}")
    String getServiceProduct(@PathVariable("id") UUID id, Model model);

    @GetMapping("/create/master")
    String addServiceProductForm(Principal principal, Model model);

    @PostMapping("/create/master")
    String addServiceProduct(Principal principal, @Valid @ModelAttribute("form") ServiceProductCreateForm form,
            BindingResult bindingResult, Model model);

    @GetMapping("/create/admin")
    String addServiceProductAdminForm(Principal principal, Model model);

    @PostMapping("/create/admin")
    String addServiceProductAdmin(Principal principal, @Valid @ModelAttribute("form") ServiceProductCreateForm form,
            BindingResult bindingResult, Model model);

    @GetMapping("/update/master/{id}")
    String updatesServiceForm(@PathVariable("id") UUID id, Model model);

    @PostMapping("/update/master/{id}")
    String updateService(@PathVariable("id") UUID id, @Valid @ModelAttribute("form") ServiceProductUpdateForm form,
            BindingResult bindingResult, Model model);

    @GetMapping("/update/admin/{id}")
    String updatesServiceAdminForm(@PathVariable("id") UUID id, Model model);

    @PostMapping("/update/admin/{id}")
    String updateServiceAdmin(@PathVariable("id") UUID id, @Valid @ModelAttribute("form") ServiceProductUpdateForm form,
            BindingResult bindingResult, Model model);
}

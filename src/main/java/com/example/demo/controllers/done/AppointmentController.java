package com.example.demo.controllers.done;

import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.forms.done.AppointmentCreateForm;
import com.example.demo.forms.done.AppointmentUpdateForm;

import java.security.Principal;
import java.util.UUID;

@RequestMapping("/appointment")
public interface AppointmentController extends BaseController {

    @GetMapping("/{id}")
    String getAppointment(@PathVariable("id") UUID id, Model model);

    @GetMapping("/all")
    String getAppointments(Principal principal, Model model);

    @GetMapping("/all/master")
    String getAppointmentsMaster(Principal principal, Model model);

    @GetMapping("/all/admin")
    String getAppointmentsAdmin(Model model);

    @GetMapping("/create/{id}")
    String createAppointmentForm(Principal principal, @PathVariable("id") UUID id, Model model);

    @PostMapping("/create/{id}")
    String createAppointment(Principal principal, @PathVariable("id") UUID id,
            @Valid @ModelAttribute("form") AppointmentCreateForm form, BindingResult bindingResult,
            Model model);

    @GetMapping("/update/master/{id}")
    String updateAppointmentForm(@PathVariable("id") UUID id, Model model);

    @PostMapping("/update/master/{id}")
    String updateAppointment(@PathVariable("id") UUID id, @Valid @ModelAttribute("form") AppointmentUpdateForm form,
            BindingResult bindingResult, Model model);

    @GetMapping("/update/admin/{id}")
    String updateAppointmentAdminForm(@PathVariable("id") UUID id, Model model);

    @PostMapping("/update/admin/{id}")
    String updateAppointmentAdmin(@PathVariable("id") UUID id,
            @Valid @ModelAttribute("form") AppointmentUpdateForm form,
            BindingResult bindingResult, Model model);
}

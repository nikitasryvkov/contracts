package com.example.demo.forms.done;

import jakarta.validation.constraints.NotBlank;

public record CategoryCreateForm(
        @NotBlank(message = "Имя обязательно") String name) {
}

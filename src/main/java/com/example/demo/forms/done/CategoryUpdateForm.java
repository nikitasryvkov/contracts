package com.example.demo.forms.done;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public record CategoryUpdateForm(
        UUID id,
        @NotBlank(message = "Имя обязательно") String name) {
}

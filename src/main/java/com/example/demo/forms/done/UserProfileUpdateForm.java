package com.example.demo.forms.done;

import jakarta.validation.constraints.NotBlank;

public record UserProfileUpdateForm(
        @NotBlank(message = "Имя обязательно") String firstName,
        @NotBlank(message = "Фамилия обязательна") String lastName,
        @NotBlank(message = "Номер обязателен") String phoneNumber) {
}

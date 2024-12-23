package com.example.demo.forms.done;

import jakarta.validation.constraints.NotBlank;

public record UserRegistrationForm(
        @NotBlank(message = "Имя обязательно") String firstName,
        @NotBlank(message = "Фамилия обязательна") String lastName,
        @NotBlank(message = "Никнейм обязателен") String userName,
        @NotBlank(message = "Почта обязательна") String email,
        @NotBlank(message = "Номер телефона обязателен") String phoneNumber,
        @NotBlank(message = "Пароль обязателен") String password) {
}

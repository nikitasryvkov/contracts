package com.example.demo.forms.done;

import jakarta.validation.constraints.NotBlank;

public record UserLoginForm(
        @NotBlank(message = "Логин обязателен") String userName,
        @NotBlank(message = "Пароль обязателен") String password) {
}

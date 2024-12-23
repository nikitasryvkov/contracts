package com.example.demo.forms;

import jakarta.validation.constraints.NotBlank;

public class LoginInputModel {
    private String userName;
    private String password;

    @NotBlank(message = "Логин обязателен")
    public String getUserName() {
        return userName;
    }

    @NotBlank(message = "Пароль обязателен")
    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

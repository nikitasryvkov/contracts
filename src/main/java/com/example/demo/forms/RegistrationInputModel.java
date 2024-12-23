package com.example.demo.forms;

import jakarta.validation.constraints.NotBlank;

public class RegistrationInputModel {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;

    @NotBlank(message = "Имя обязательно")
    public String getFirstName() {
        return firstName;
    }

    @NotBlank(message = "Фамилия обязательно")
    public String getLastName() {
        return lastName;
    }

    @NotBlank(message = "Никнейм обязательно")
    public String getUserName() {
        return userName;
    }

    @NotBlank(message = "Почта обязательна")
    public String getEmail() {
        return email;
    }

    @NotBlank(message = "Номер телефона обязателен")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @NotBlank(message = "Пароль обязателен")
    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.example.demo.viewmodel.user;

import com.example.demo.viewmodel.pages.BaseViewModel;

public record UserProfileViewModel(
        BaseViewModel base,
        String firstName,
        String lastName,
        String userName,
        String email,
        String phoneNumber,
        Integer numberOfAppointments) {
}

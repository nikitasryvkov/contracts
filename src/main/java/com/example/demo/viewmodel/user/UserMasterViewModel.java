package com.example.demo.viewmodel.user;

import java.util.UUID;

public class UserMasterViewModel {
    private UUID id;
    private String userFirstName;

    public UserMasterViewModel(UUID id, String masterFirstName) {
        this.id = id;
        this.userFirstName = masterFirstName;
    }

    protected UserMasterViewModel() {
    }

    public UUID getId() {
        return id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUserFirstName(String masterFirstName) {
        this.userFirstName = masterFirstName;
    }
}

package com.example.demo.viewmodel.serviceProduct;

import java.util.UUID;

public class ServiceProductsViewModel {
    private UUID id;
    private String title;

    public ServiceProductsViewModel(UUID id, String title) {
        this.id = id;
        this.title = title;
    }

    protected ServiceProductsViewModel() {
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

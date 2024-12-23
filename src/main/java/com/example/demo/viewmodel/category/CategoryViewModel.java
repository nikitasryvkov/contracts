package com.example.demo.viewmodel.category;

import java.util.UUID;

public class CategoryViewModel {
    private UUID id;
    private String name;

    public CategoryViewModel(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    protected CategoryViewModel() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

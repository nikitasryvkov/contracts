package com.example.demo.viewmodel.serviceProduct;

import java.util.UUID;

import com.example.demo.viewmodel.pages.BaseViewModel;

public class ServiceProductViewModel {
    private BaseViewModel base;
    private UUID id;
    private String title;
    private String description;
    private UUID categoryId;
    private String categoryTitle;
    private Long price;
    private UUID createdById;
    private String createdByName;

    public ServiceProductViewModel(BaseViewModel base, UUID id, String title, String description, UUID categoryId,
            String categoryTitle, Long price, UUID createdById, String createdByName) {
        this.base = base;
        this.id = id;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.categoryTitle = categoryTitle;
        this.price = price;
        this.createdById = createdById;
        this.createdByName = createdByName;
    }

    protected ServiceProductViewModel() {
    }

    public BaseViewModel getBase() {
        return base;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public Long getPrice() {
        return price;
    }

    public UUID getCreatedById() {
        return createdById;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setBase(BaseViewModel base) {
        this.base = base;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setCreatedById(UUID createdById) {
        this.createdById = createdById;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }
}

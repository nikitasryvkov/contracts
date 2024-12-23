package com.example.demo.viewmodel.pages;

import java.util.List;

import com.example.demo.viewmodel.category.CategoryViewModel;

public record HomeViewModel(
        BaseViewModel base,
        List<CategoryViewModel> category) {
}

package com.example.demo.forms.done;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record ServiceProductUpdateForm(
        UUID id,
        @NotNull(message = "Название обязательно") String title,
        @NotNull(message = "Описание обязательно") String description,
        UUID categoryId,
        String categoryName,
        @NotNull(message = "Цена обязательная") Long price,
        UUID createdById) {
}

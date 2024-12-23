package com.example.demo.forms;

import java.util.UUID;

public record UserServiceUpdateForm(
        String title,
        String description,
        UUID categoryId,
        Long price,
        String status) {
}

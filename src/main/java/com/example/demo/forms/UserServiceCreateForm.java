package com.example.demo.forms;

import java.util.UUID;

public record UserServiceCreateForm(
                String title,
                String description,
                UUID categoryId,
                Long price,
                UUID createdById,
                String status) {
}

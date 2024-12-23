package com.example.demo.forms.done;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FeedbackCreateForm(
        LocalDateTime createdAt,
        @NotBlank(message = "Текст обязателен") String text,
        UUID appointmentId,
        String serviceTitle,
        @NotNull(message = "Оценка обязательна") Integer estimation) {
}

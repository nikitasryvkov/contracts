package com.example.demo.forms.done;

import jakarta.validation.constraints.NotNull;

public record FeedbackUpdateForm(
        @NotNull(message = "Текст обязателен") String text,
        @NotNull(message = "Оценка обязательна") Integer estimation) {
}

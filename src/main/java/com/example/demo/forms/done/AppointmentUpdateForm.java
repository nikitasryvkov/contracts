package com.example.demo.forms.done;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AppointmentUpdateForm(
        UUID id,
        LocalDateTime createdAt,
        @NotNull(message = "Дата обязательна") @FutureOrPresent(message = "Некорректная дата") LocalDateTime recordTime,
        @NotBlank(message = "Статус обязателен") String status) {
}

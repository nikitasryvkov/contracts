package com.example.demo.forms.done;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AppointmentUpdateAdminForm(
        UUID id,
        @NotNull(message = "Дата обязательна") @FutureOrPresent(message = "Некорректная дата") LocalDateTime recordTime,
        UUID masterId,
        @NotNull(message = "Имя обязательно") String userFirstName,
        @NotBlank(message = "Статус обязателен") String status) {
}

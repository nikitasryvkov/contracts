package com.example.demo.forms.done;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

public record AppointmentCreateForm(
        LocalDateTime createdAt,
        @NotNull(message = "Дата обязательна") @FutureOrPresent(message = "Дата должна быть сегодняшней или будущей") LocalDateTime recordTime,
        String clientName,
        UUID masterId,
        String masterName,
        UUID serviceId,
        String serviceTitle) {

    @Override
    public String toString() {
        return "ClientName: " + clientName + "\nMasterId: " + masterId + "\nServiceId: " + serviceId;
    }
}

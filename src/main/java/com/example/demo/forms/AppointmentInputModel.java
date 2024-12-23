package com.example.demo.forms;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class AppointmentInputModel {
    private Integer serviceId;
    private LocalDateTime reservedTime;
    private List<String> masters;

    @NotBlank(message = "Услуга обязательна")
    public Integer getServiceId() {
        return serviceId;
    }

    @NotBlank(message = "Время обязательно")
    public LocalDateTime getReservedTime() {
        return reservedTime;
    }

    @NotBlank(message = "Мастер обязателен")
    public List<String> getMasters() {
        return masters;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public void setReservedTime(LocalDateTime reservedTime) {
        this.reservedTime = reservedTime;
    }

    public void setMasters(List<String> masters) {
        this.masters = masters;
    }
}

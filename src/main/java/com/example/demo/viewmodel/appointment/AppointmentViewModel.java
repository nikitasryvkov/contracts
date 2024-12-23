package com.example.demo.viewmodel.appointment;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.viewmodel.pages.BaseViewModel;

public class AppointmentViewModel {
    private BaseViewModel base;
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime recordTime;
    private UUID clientId;
    private String clientName;
    private UUID masterId;
    private String masterName;
    private UUID serviceId;
    private String serviceTitle;
    private String status;

    public AppointmentViewModel(BaseViewModel base, UUID id, LocalDateTime createdAt, LocalDateTime recordTime,
            UUID clientId, String clientName, UUID masterId, String masterName, UUID serviceId, String serviceTitle,
            String status) {
        this.base = base;
        this.id = id;
        this.createdAt = createdAt;
        this.recordTime = recordTime;
        this.clientId = clientId;
        this.clientName = clientName;
        this.masterId = masterId;
        this.masterName = masterName;
        this.serviceId = serviceId;
        this.serviceTitle = serviceTitle;
        this.status = status;
    }

    protected AppointmentViewModel() {
    }

    public BaseViewModel getBase() {
        return base;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    public UUID getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public UUID getMasterId() {
        return masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public UUID getServiceId() {
        return serviceId;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setBase(BaseViewModel base) {
        this.base = base;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setMasterId(UUID masterId) {
        this.masterId = masterId;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

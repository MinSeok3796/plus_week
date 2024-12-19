package com.example.demo.entity;

import lombok.Getter;

@Getter
public enum ReservationStatus {
    PENDING("pending"),
    APPROVED("approved"),
    CANCELED("canceled"),
    EXPIRED("expired");

    private final String name;

    ReservationStatus(String name) {
        this.name = name;
    }

    public static ReservationStatus of(String statusName) {
        for (ReservationStatus status : values()) {
            if (status.getName().equals(statusName)) {
                return status;
            }
        }
        throw new IllegalArgumentException("해당 상태를 찾을수 없습니다." + statusName);
    }
}
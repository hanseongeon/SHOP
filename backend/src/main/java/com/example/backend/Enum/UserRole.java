package com.example.backend.Enum;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    COMPANY("ROLE_COMPANY"),
    USER("ROLE_USER");
    UserRole(String value) {
        this.value = value;
    }

    private String value;
}

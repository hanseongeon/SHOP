package com.example.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class SiteUser {

    @Id
    private String id;

    private String nickName;

    private String password;

    private String role;
}

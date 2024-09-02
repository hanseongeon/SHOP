package com.example.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class SiteUser {

    @Id
    private String id;

    private String nickName;

    private String password;

    private String role;

    @Builder
    public SiteUser(String id,String nickName,String password,String role){
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.role = role;
    }
}

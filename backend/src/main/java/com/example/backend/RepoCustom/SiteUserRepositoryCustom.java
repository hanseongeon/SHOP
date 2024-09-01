package com.example.backend.RepoCustom;

import com.example.backend.Entity.SiteUser;

public interface SiteUserRepositoryCustom {
    SiteUser findByUserName(String username);
}

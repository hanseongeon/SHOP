package com.example.backend.Service;

import com.example.backend.Entity.SiteUser;
import com.example.backend.Repository.SiteUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SiteUserService {
    private final SiteUserRepository siteUserRepository;

    public SiteUser findByUsername(String username){
        return null;
    }
}

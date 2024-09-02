package com.example.backend.Service;

import com.example.backend.DTO.UserRequestDTO;
import com.example.backend.Entity.SiteUser;
import com.example.backend.Service.Modules.SiteUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MultiService {
    private final SiteUserService siteUserService;

    public SiteUser userSingup(UserRequestDTO userRequestDTO){
        return siteUserService.singUp(userRequestDTO);

    }
}

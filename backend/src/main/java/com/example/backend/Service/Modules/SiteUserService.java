package com.example.backend.Service.Modules;

import com.example.backend.DTO.UserRequestDTO;
import com.example.backend.Entity.SiteUser;
import com.example.backend.Enum.UserRole;
import com.example.backend.Exception.DuplicateException;
import com.example.backend.Repository.SiteUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SiteUserService {
    private final SiteUserRepository siteUserRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser findByUsername(String username) {
        return siteUserRepository.findByUserName(username);
    }

    public SiteUser save(SiteUser siteUser) {
        return siteUserRepository.save(siteUser);
    }

    public SiteUser singUp(UserRequestDTO userRequestDTO) {
        if (this.findByUsername(userRequestDTO.id()) != null) {
            throw new DuplicateException("중복된 아이디입니다.");
        }
        if (userRequestDTO.role() == 0) {
            return this.save(new SiteUser(userRequestDTO.id(), userRequestDTO.nickname(), passwordEncoder.encode(userRequestDTO.password()), UserRole.COMPANY.getValue()));
        }else{
            return this.save(new SiteUser(userRequestDTO.id(), userRequestDTO.nickname(), passwordEncoder.encode(userRequestDTO.password()), UserRole.USER.getValue()));
        }

    }
}

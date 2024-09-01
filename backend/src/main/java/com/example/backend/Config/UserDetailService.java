package com.example.backend.Config;

import com.example.backend.Entity.SiteUser;
import com.example.backend.Enum.UserRole;
import com.example.backend.Repository.SiteUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {
    private final SiteUserRepository siteUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SiteUser siteUser = siteUserRepository.findByUserName(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(siteUser.getRole().equals("ROLE_ADMIN")){
            authorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
        } else if (siteUser.getRole().equals("ROLE_COMPANY")) {
            authorities.add(new SimpleGrantedAuthority(UserRole.COMPANY.getValue()));
        }else{
            authorities.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
        }
        return new UserDetail(siteUser,authorities);
    }
}

package com.example.backend.Repository;

import com.example.backend.Entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser,String> {
}

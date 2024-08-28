package com.example.backend.Repository;

import com.example.backend.Entity.SiteUser;
import com.example.backend.RepoCustom.SiteUserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser,String>, SiteUserRepositoryCustom {
}

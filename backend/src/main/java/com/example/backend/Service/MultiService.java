package com.example.backend.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MultiService {
    private final SiteUserService siteUserService;
}

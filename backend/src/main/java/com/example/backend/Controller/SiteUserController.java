package com.example.backend.Controller;

import com.example.backend.DTO.UserRequestDTO;
import com.example.backend.Entity.SiteUser;
import com.example.backend.Service.MultiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class SiteUserController {
    private final MultiService multiService;

    //회원가입
    @GetMapping("/singup")
    public ResponseEntity<?> user(@RequestBody UserRequestDTO userRequestDTO) {
        SiteUser siteUser = multiService.userSingup(userRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }

}

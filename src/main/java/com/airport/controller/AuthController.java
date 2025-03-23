package com.airport.controller;

import com.airport.dto.LoginRequest;
import com.airport.dto.RegisterRequest;
import com.airport.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // ✅ Register API
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest request) {
        authService.registerUser(request);
        return ResponseEntity.ok("User registered successfully!");
    }

    // ✅ Login API
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest request) {
        String token = authService.loginUser(request); // 🔥 Fix: Ensure this method exists
        return ResponseEntity.ok(token);
    }
}

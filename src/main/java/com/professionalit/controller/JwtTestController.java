package com.professionalit.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtTestController {

    @GetMapping("/test/jwt")
    public Map<String, Object> testJwt(
            @AuthenticationPrincipal Jwt jwt) {

        return Map.of(
            "authenticated", true,
            "subject", jwt.getSubject(),
            "issuer", jwt.getIssuer().toString()
        );
    }
}
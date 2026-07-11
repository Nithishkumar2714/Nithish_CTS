package com.cognizant.jwt.controller;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;@RestController
public class AuthenticationController {
    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {
        String user = getUser(authHeader);
        String token = generateJwt(user);
        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        return map;
    }
    private String getUser(String authHeader) {
        String encoded = authHeader.substring(6);
        String credentials = new String(Base64.getDecoder().decode(encoded));
        return credentials.substring(0, credentials.indexOf(":"));
    }
    private String generateJwt(String user) {
        return Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1200000))
                .signWith(SignatureAlgorithm.HS256, "secretkey")
                .compact();
    }
}

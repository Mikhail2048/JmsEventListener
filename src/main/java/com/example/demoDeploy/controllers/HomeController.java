package com.example.demoDeploy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> getContent() {
        return ResponseEntity.ok().body("Hello from California!!!");
    }
}

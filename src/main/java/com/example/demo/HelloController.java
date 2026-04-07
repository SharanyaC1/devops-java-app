package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello DevOps 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "App is running ✅";
    }

    @GetMapping("/info")
    public String info() {
        return "Deployed via Docker + Kubernetes + CI/CD";
    }
}

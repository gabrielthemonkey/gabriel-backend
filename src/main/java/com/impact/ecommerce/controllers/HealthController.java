package com.impact.ecommerce.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @Operation(summary = "Check that the application is running!")
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

}

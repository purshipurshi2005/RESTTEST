package com.oracle;

@RestController
@RequestMapping("/api")
public class RestTestController {

    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Hello! Welcome to RESTTEST.");
    }
}
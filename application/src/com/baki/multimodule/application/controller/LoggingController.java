package com.baki.multimodule.application.controller;

import com.baki.multimodule.api.logging.audit.AuditLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoggingController {
    private final AuditLogger auditLogger;

    @PostMapping("/log")
    public ResponseEntity<Void> log(@RequestParam final String message) {
        this.auditLogger.auditLog(message);

        return ResponseEntity.ok().build();
    }
}

package com.cse.iitj.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuditController {

    @Autowired
    private AuditService auditService;

    @GetMapping("/auditDetail")
    public ResponseEntity getAuditData() {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("status", HttpStatus.OK);
        responseMap.put("Audit", auditService.returnAuditLog());
        return ResponseEntity.ok(responseMap);
    }

    @GetMapping("/auditDetail/{auditId}")
    public ResponseEntity getAuditDataById(Long sessionId) {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("status", HttpStatus.OK);
        responseMap.put("Audit", auditService.returnAuditLog());
        return ResponseEntity.ok(responseMap);
    }

}

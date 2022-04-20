package com.cse.iitj.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    HealthCheckService healthService;

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);

    @GetMapping("/health")
    private ResponseEntity<Object> getAllCourses() {
        LOGGER.info("Checking Health of Application");
        return healthService.findAll();
    }

}
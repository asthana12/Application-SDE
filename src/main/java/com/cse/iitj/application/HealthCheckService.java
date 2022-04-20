package com.cse.iitj.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HealthCheckService {

    @Autowired
    private CourseRepository repository;

    @Autowired
    private AuditService auditService;

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckService.class);

    public ResponseEntity findAll() {
        Map<String, Object> responseMap = new HashMap<>();
        // service.runSyncJob();
        try {
            LOGGER.info("Running Database Query");
            List<Courses> courseList = repository.findAll();
            auditService.createAuditLog("At Steps", ApplicationConstants.LOG_INFO);
            responseMap.put("status", HttpStatus.OK);
            responseMap.put("Courses", courseList.toString());
            auditService.createAuditLog("At Step", ApplicationConstants.LOG_INFO);
            int i = 1 / 0;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            System.out.println(LOGGER.getName());
            auditService.createAuditLog(e.getMessage(), ApplicationConstants.LOG_ERROR);
            responseMap.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
        return ResponseEntity.ok(responseMap);
    }

}

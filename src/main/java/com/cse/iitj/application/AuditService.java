package com.cse.iitj.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AuditService {

    @Autowired
    private AuditDetailRepository repository;

    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public void createAuditLog(String auditMessage, String logLevel) {
        AuditDetail audit = new AuditDetail();
        audit.setAuditDetail(auditMessage);
        audit.setLogLevel(logLevel);
        audit.setUpdateTmstmp(new java.sql.Date(System.currentTimeMillis()));
        repository.save(audit);
    }

    public List<AuditDetailDto> returnAuditLog() {
        List<AuditDetail> auditDetailList = repository.findAll();
        // List<Map<String, Object>> output = jdbcTemplate.queryForList("select * from
        // COURSES.AUDIT_TABLE");
        List<AuditDetailDto> auditList = new ArrayList<>();
        for (AuditDetail auditDetail : auditDetailList) {
            AuditDetailDto dtoObj = new AuditDetailDto();
            dtoObj.setAuditDetail(auditDetail.getAuditDetail());
            dtoObj.setLogLevel(auditDetail.getLogLevel());
            dtoObj.setUpdateTmstmp(new Date(auditDetail.getUpdateTmstmp().getTime()));
            auditList.add(dtoObj);
        }
        return auditList;
    }
}

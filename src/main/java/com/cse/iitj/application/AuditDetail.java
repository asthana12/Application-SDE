package com.cse.iitj.application;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(schema = "COURSES", name = "AUDIT_TABLE")
public class AuditDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "audit_id")
    private Integer auditId;
    @Column(name = "audit_detail")
    private String auditDetail;
    @Column(name = "log_level")
    private String logLevel;
    @Column(name = "update_tmstmp")
    private Date updateTmstmp;

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getAuditDetail() {
        return auditDetail;
    }

    public void setAuditDetail(String auditDetail) {
        this.auditDetail = auditDetail;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public Date getUpdateTmstmp() {
        return updateTmstmp;
    }

    public void setUpdateTmstmp(Date updateTmstmp) {
        this.updateTmstmp = updateTmstmp;
    }
}

package com.cse.iitj.application;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"auditId", "auditDetail", "url", "timeDiff", "stepName"})
public class AuditDetailDto {

    @JsonProperty("auditId")
    private Long auditId;
    @JsonProperty("auditDetail")
    private String auditDetail;
    @JsonProperty("logLevel")
    private String logLevel;
    @JsonProperty("updateTmstmp")
    private Date updateTmstmp;

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
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
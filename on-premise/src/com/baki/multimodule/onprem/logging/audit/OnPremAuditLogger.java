package com.baki.multimodule.onprem.logging.audit;

import com.baki.multimodule.api.logging.audit.AuditEvent;
import com.baki.multimodule.api.logging.audit.AuditLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OnPremAuditLogger implements AuditLogger {
    @Override
    public void auditLog(final AuditEvent auditEvent) {
        log.info("ON-PREM: " + auditEvent.toString());
    }

    @Override
    public void auditLog(final String message) {
        log.info("ON-PREM: " + message);
    }
}

package com.example.student_db_rest_api.service;

import com.example.student_db_rest_api.domain.entity.AbstractBaseEntity;
import com.example.student_db_rest_api.domain.entity.AuditableEntity;
import com.example.student_db_rest_api.util.TechnicalUser;

public abstract class AbstractBaseService<E extends AuditableEntity>{



    protected void createAuditableFields(E entity) {
        entity.setCreatedBy(TechnicalUser.ADMIN.name());
        entity.setUpdatedBy(TechnicalUser.ADMIN.name());
    }

    protected void updateAuditableFields(E entity) {
        entity.setUpdatedBy(TechnicalUser.ADMIN.name());
    }
}

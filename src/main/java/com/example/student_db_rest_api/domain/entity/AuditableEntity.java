package com.example.student_db_rest_api.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class AuditableEntity extends AbstractBaseEntity{

    protected LocalDateTime created;
    protected String createdBy;
    protected LocalDateTime updated;
    protected String updatedBy;
}

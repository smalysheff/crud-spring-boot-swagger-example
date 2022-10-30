package com.example.student_db_rest_api.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class AuditableEntity extends AbstractBaseEntity{

    @CreationTimestamp
    @NotNull
    protected LocalDateTime created;

    @NotNull
    protected String createdBy;

    @UpdateTimestamp
    @NotNull
    protected LocalDateTime updated;

    @NotNull
    protected String updatedBy;
}

package com.example.student_db_rest_api.domain.entity;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractBaseEntity implements Persistable<UUID> {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    protected UUID id = UUID.randomUUID();

//    @Transient
//    private static Boolean persisted = givenId != null;

    @Override
    public UUID getPrimaryKey() {
        return id;
    }

    @Override
    public Boolean isNew() {
        //TODO реализовать
        return true;
    }

//    @PostPersist
//    @PostLoad
//    private void setPersisted() {
//        persisted = true;
//    }
}

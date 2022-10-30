package com.example.student_db_rest_api.mapper;

import com.example.student_db_rest_api.domain.entity.AbstractBaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface BaseMapper <R extends Serializable, E extends AbstractBaseEntity>{
    R mapToDto(E entity);
    E mapToEntity(R request);
    Collection<R> mapCollection(Collection<E> entities);
}

package com.example.student_db_rest_api.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

public interface BaseService <R extends Serializable, ID extends UUID>{

    R getById(ID id);
    Collection<R> getAll();
    void create(R request);
    void update(R request, ID id);
    void delete(ID id);
}

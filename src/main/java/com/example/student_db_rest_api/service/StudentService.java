package com.example.student_db_rest_api.service;

import com.example.student_db_rest_api.domain.model.StudentDto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;


public interface StudentService extends BaseService<StudentDto, UUID>{

    @Override
    StudentDto getById(UUID uuid);

    @Override
    Collection<StudentDto> getAll();

    @Override
    void create(StudentDto request);

    @Override
    void update(StudentDto request, UUID uuid);

    @Override
    void delete(UUID uuid);
}

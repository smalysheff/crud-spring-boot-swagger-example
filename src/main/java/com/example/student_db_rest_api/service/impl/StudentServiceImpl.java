package com.example.student_db_rest_api.service.impl;

import com.example.student_db_rest_api.domain.model.StudentDto;
import com.example.student_db_rest_api.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentDto getById(UUID uuid) {
        return null;
    }

    @Override
    public Collection<StudentDto> getAll() {
        return null;
    }

    @Override
    public void create(StudentDto request) {

    }

    @Override
    public void update(StudentDto request, UUID uuid) {

    }

    @Override
    public void delete(UUID uuid) {

    }
}

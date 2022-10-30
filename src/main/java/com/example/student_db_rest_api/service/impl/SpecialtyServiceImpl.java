package com.example.student_db_rest_api.service.impl;

import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import com.example.student_db_rest_api.service.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {


    @Override
    public SpecialtyDto getById(UUID uuid) {
        return null;
    }

    @Override
    public Collection<SpecialtyDto> getAll() {
        return null;
    }

    @Override
    public void create(SpecialtyDto request) {

    }

    @Override
    public void update(SpecialtyDto request, UUID uuid) {

    }

    @Override
    public void delete(UUID uuid) {

    }
}

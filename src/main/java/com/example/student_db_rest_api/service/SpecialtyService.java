package com.example.student_db_rest_api.service;

import com.example.student_db_rest_api.domain.model.SpecialtyDto;

import java.util.Collection;
import java.util.UUID;

public interface SpecialtyService extends BaseService<SpecialtyDto, UUID>{

    @Override
    SpecialtyDto getById(UUID uuid);

    @Override
    Collection<SpecialtyDto> getAll();

    @Override
    void create(SpecialtyDto request);

    @Override
    void update(SpecialtyDto request, UUID uuid);

    @Override
    void delete(UUID uuid);
}

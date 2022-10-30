package com.example.student_db_rest_api.service.impl;

import com.example.student_db_rest_api.domain.entity.Specialty;
import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import com.example.student_db_rest_api.exception.RecordNotFoundException;
import com.example.student_db_rest_api.mapper.SpecialtyMapper;
import com.example.student_db_rest_api.repository.SpecialtyRepository;
import com.example.student_db_rest_api.service.AbstractBaseService;
import com.example.student_db_rest_api.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SpecialtyServiceImpl extends AbstractBaseService<Specialty> implements SpecialtyService {

    private static final String RECORD_NOT_FOUND = "Record not found";

    private final SpecialtyMapper mapper;
    private final SpecialtyRepository repository;

    @Override
    public SpecialtyDto getById(UUID id) {
        Specialty found = repository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(RECORD_NOT_FOUND));
        return mapper.mapToDto(found);
    }

    @Override
    public Collection<SpecialtyDto> getAll() {
        return mapper.mapCollection(repository.findAll());
    }

    @Override
    public void create(SpecialtyDto request) {
        Specialty entity = mapper.mapToEntity(request);
        createAuditableFields(entity);
        repository.save(entity);
    }

    @Override
    public void update(SpecialtyDto request, UUID id) {
        Specialty updatable = repository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(RECORD_NOT_FOUND));

        updatable.setCode(request.getCode());
        updatable.setName(request.getName());

        updateAuditableFields(updatable);

        repository.save(updatable);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}

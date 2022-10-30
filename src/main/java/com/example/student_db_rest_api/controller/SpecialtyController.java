package com.example.student_db_rest_api.controller;

import com.example.student_db_rest_api.controller.api.SpecialtyControllerApi;
import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import com.example.student_db_rest_api.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class SpecialtyController implements SpecialtyControllerApi {

    private final SpecialtyService service;

    @Override
    public SpecialtyDto getById(String id) {
        return service.getById(UUID.fromString(id));
    }

    @Override
    public Collection<SpecialtyDto> getAll() {
        return service.getAll();
    }

    @Override
    public void create(SpecialtyDto request) {
        service.create(request);
    }

    @Override
    public void update(SpecialtyDto request,String id) {
        service.update(request, UUID.fromString(id));
    }

    @Override
    public void delete(String id) {
        service.delete(UUID.fromString(id));
    }
}


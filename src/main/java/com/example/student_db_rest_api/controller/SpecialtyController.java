package com.example.student_db_rest_api.controller;

import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import com.example.student_db_rest_api.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/specialties")
@RequiredArgsConstructor
public class SpecialtyController {

    private final SpecialtyService service;

    @GetMapping("/{id}")
    public SpecialtyDto getById(@PathVariable String id) {
        return service.getById(UUID.fromString(id));
    }

    @GetMapping
    public Collection<SpecialtyDto> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void create(@RequestBody SpecialtyDto request) {
        service.create(request);
    }

    @PutMapping
    public void update(@RequestBody SpecialtyDto request, @PathVariable String id) {
        service.update(request, UUID.fromString(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(UUID.fromString(id));
    }
}


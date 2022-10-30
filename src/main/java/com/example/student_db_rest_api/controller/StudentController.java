package com.example.student_db_rest_api.controller;

import com.example.student_db_rest_api.domain.model.StudentDto;
import com.example.student_db_rest_api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping("/{id}")
    public StudentDto getById(@PathVariable String id) {
        return service.getById(UUID.fromString(id));
    }

    @GetMapping
    public Collection<StudentDto> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void create(@RequestBody StudentDto request) {
        service.create(request);
    }

    @PutMapping
    public void update(@RequestBody StudentDto request, String id) {
        service.update(request, UUID.fromString(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(UUID.fromString(id));
    }
}

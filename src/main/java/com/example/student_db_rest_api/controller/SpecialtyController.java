package com.example.student_db_rest_api.controller;

import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SpecialtyController {

    @PostMapping
    public void create(SpecialtyDto dto) {

    }
}


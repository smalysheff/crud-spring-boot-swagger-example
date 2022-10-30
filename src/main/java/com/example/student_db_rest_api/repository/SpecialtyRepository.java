package com.example.student_db_rest_api.repository;

import com.example.student_db_rest_api.domain.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecialtyRepository extends JpaRepository<Specialty, UUID> {

}

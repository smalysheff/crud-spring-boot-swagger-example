package com.example.student_db_rest_api.repository;

import com.example.student_db_rest_api.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {

}

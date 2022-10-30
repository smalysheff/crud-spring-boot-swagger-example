package com.example.student_db_rest_api.domain.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class StudentDto implements Serializable {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private int age;
    private String groupName;
}

package com.example.student_db_rest_api.domain.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class SpecialtyDto implements Serializable {

    private String name;
    private String code;
}

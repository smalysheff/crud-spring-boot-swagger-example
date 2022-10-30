package com.example.student_db_rest_api.mapper;

import com.example.student_db_rest_api.domain.entity.Specialty;
import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SpecialtyMapper extends BaseMapper<SpecialtyDto, Specialty>{
}

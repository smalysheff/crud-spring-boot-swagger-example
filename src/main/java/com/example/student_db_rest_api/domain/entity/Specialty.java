package com.example.student_db_rest_api.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Specialty extends AuditableEntity {

    private String name;

    private String code;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "specialty", fetch = FetchType.LAZY)
    private Set<Student> students;
}

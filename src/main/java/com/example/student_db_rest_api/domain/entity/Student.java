package com.example.student_db_rest_api.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student extends AuditableEntity {

    private String firstName;
    private String lastName;
    private LocalDate birthday;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne()
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
}

package com.Anwar.Spring.Boot.Application.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@DiscriminatorValue("student")
public class Student extends User {

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    @JsonBackReference
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    @JsonBackReference
    private Professor Professor;
    @ManyToOne
    @JoinColumn(name = "administrator_id")
    @JsonBackReference
    private AdministratorStudent administrator;
}

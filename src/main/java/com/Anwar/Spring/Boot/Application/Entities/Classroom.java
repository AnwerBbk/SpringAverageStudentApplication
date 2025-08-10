package com.Anwar.Spring.Boot.Application.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "classrooms")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String description;
    @Column(length = 50, nullable = false)
    private int numberStudents;
    @Column(length = 50, nullable = false)
    private int numberClasses;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "administrator_id")
    @JsonBackReference
    private AdministratorStudent administrator;

    public void getStudent(Student student) {
        students.add(student);
        student.setClassroom(this);
    }
}

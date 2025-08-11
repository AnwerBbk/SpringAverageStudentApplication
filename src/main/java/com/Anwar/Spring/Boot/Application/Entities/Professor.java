package com.Anwar.Spring.Boot.Application.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Professor")
public class Professor extends User {

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Student> students;

    public List<Student> getMyStudents() {
        return this.students;
    }

    public void enterGrade() {}
}



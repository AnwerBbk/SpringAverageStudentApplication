package com.Anwar.Spring.Boot.Application.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@DiscriminatorValue("Professor")
public class Professor extends User {
    @OneToMany(mappedBy="Professor",cascade = CascadeType.ALL)
    private List<Student>  students;
    public List<Student> getMyStudents(){
        return this.students;
    }
    public void enterGrade(){}

}

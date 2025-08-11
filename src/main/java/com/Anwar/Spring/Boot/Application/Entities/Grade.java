package com.Anwar.Spring.Boot.Application.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private double dsGrade ;
    @Column(length = 100)
    private double examGrade ;
    @Column(length = 100)
    private Double TpGrade;
    @ManyToOne
    @JoinColumn(name="professor_id")
    @JsonBackReference
    private Professor professor;
    @ManyToOne
    @JoinColumn(name="student_id")
    @JsonBackReference
    private Student student;
    @ManyToOne
    @JoinColumn(name="subject_id")
    @JsonBackReference
    private Subject subject;
    public double CalculateSubjectGrade(){
        if(this.TpGrade==null) {
            return 0.3 * dsGrade + 0.7*examGrade;
        }
        else{
            return 0.1*dsGrade+0.2*dsGrade + 0.7 * examGrade;
        }
    }

}

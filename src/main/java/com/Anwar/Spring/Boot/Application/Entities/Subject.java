package com.Anwar.Spring.Boot.Application.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String Dscription ;
    @OneToMany(mappedBy = "subject" , cascade = CascadeType.ALL)
    private List<Grade> Grade;
}

package com.Anwar.Spring.Boot.Application.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("name")
    private String Name;
    @Column(length = 100)
    @JsonProperty("discrition")
    private String Dscription ;
    @OneToMany(mappedBy = "subject" , cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Grade> Grade;
}

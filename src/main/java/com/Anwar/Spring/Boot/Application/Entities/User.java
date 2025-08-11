package com.Anwar.Spring.Boot.Application.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @JsonProperty("firstname")
    @Column(name = "firstname", length = 20)
    protected String firstname;

    @JsonProperty("lastname")
    @Column(name = "lastname", length = 20)
    protected String lastname;

    @JsonProperty("email")
    @Column(unique = true)
    protected String email;

    @JsonProperty("password")
    protected String password;

    public void signUp() {}
    public void login() {}
    public void logout() {}
    public void update() {}
    public void delete() {}
}

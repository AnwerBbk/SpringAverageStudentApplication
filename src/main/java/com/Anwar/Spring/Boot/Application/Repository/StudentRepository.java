package com.Anwar.Spring.Boot.Application.Repository;

import com.Anwar.Spring.Boot.Application.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> { }


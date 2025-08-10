package com.Anwar.Spring.Boot.Application.Repository;

import com.Anwar.Spring.Boot.Application.Entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface GradeRepository extends JpaRepository<Grade,Long> {

}

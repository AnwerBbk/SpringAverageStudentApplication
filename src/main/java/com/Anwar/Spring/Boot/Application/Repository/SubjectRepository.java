package com.Anwar.Spring.Boot.Application.Repository;

import com.Anwar.Spring.Boot.Application.Entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}

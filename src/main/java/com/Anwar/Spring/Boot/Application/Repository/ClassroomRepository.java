package com.Anwar.Spring.Boot.Application.Repository; // Correct spelling of 'Repository'

import org.springframework.data.jpa.repository.JpaRepository;
import com.Anwar.Spring.Boot.Application.Entities.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}


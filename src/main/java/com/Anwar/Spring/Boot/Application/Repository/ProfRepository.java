package com.Anwar.Spring.Boot.Application.Repository;

import com.Anwar.Spring.Boot.Application.Entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository<Professor,Long> {
}

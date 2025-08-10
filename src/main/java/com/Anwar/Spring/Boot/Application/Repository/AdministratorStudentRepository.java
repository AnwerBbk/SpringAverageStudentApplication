package com.Anwar.Spring.Boot.Application.Repository;

import com.Anwar.Spring.Boot.Application.Entities.AdministratorStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorStudentRepository extends JpaRepository<AdministratorStudent, Long> {
}

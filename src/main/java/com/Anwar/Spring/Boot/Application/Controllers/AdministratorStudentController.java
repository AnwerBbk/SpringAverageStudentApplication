package com.Anwar.Spring.Boot.Application.Controllers;

import com.Anwar.Spring.Boot.Application.Entities.AdministratorStudent;
import com.Anwar.Spring.Boot.Application.Repository.AdministratorStudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrators")
@Getter
@Setter
public class AdministratorStudentController {

    private final AdministratorStudentRepository administratorStudentRepository;

    public AdministratorStudentController(AdministratorStudentRepository administratorStudentRepository) {
        this.administratorStudentRepository = administratorStudentRepository;
    }

    @PostMapping
    public AdministratorStudent post(@RequestBody AdministratorStudent administratorStudent) {
        return administratorStudentRepository.save(administratorStudent);
    }

    @GetMapping
    public ResponseEntity<List<AdministratorStudent>> getAllAdministratorStudents()
    {
        return ResponseEntity.ok(administratorStudentRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public void deleteAdministratorStudent(@PathVariable Long id)
    {
        administratorStudentRepository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllAdministratorStudents()
    {
        administratorStudentRepository.deleteAll();
    }
}


package com.Anwar.Spring.Boot.Application.Controllers;

import com.Anwar.Spring.Boot.Application.Entities.Professor;
import com.Anwar.Spring.Boot.Application.Repository.ProfRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/prof")
@Getter
@Setter
public class ProfController {

    private final ProfRepository profRepository;

    public ProfController(ProfRepository profRepository) {
        this.profRepository = profRepository;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor) {
        Professor savedProf = profRepository.save(professor);
        return ResponseEntity.ok(savedProf);
    }

    // READ all
    @GetMapping
    public List<Professor> getAllProfessors() {
        return profRepository.findAll();
    }

    // READ one by id
    @GetMapping("/{id}")
    public ResponseEntity<Professor> getProfessorById(@PathVariable Long id) {
        return profRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Professor> updateProfessor(@PathVariable Long id, @RequestBody Professor updatedProfessor) {
        return profRepository.findById(id)
                .map(professor -> {
                    professor.setFirstname(updatedProfessor.getFirstname());
                    professor.setLastname(updatedProfessor.getLastname());
                    professor.setEmail(updatedProfessor.getEmail());
                    professor.setPassword(updatedProfessor.getPassword());
                    Professor saved = profRepository.save(professor);
                    return ResponseEntity.ok(saved);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE one
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfessorById(@PathVariable Long id) {
        if (profRepository.existsById(id)) {
            profRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE all
    @DeleteMapping("/all")
    public ResponseEntity<Void> deleteAllProfessors() {
        profRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}

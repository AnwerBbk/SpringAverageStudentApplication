package com.Anwar.Spring.Boot.Application.Controllers;

import com.Anwar.Spring.Boot.Application.Entities.Classroom;
import com.Anwar.Spring.Boot.Application.Repository.ClassroomRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
@Getter
@Setter
public class ClassroomController {

    private final ClassroomRepository classroomRepository;

    public ClassroomController(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    // CREATE
    @PostMapping
    public Classroom post(@RequestBody Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    // READ all
    @GetMapping
    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    // READ one by id
    @GetMapping("/{id}")
    public ResponseEntity<Classroom> getClassroomById(@PathVariable Long id) {
        return classroomRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    // DELETE one
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassroomById(@PathVariable Long id) {
        if (classroomRepository.existsById(id)) {
            classroomRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE all
    @DeleteMapping("/all")
    public ResponseEntity<Void> deleteAllClassrooms() {
        classroomRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}





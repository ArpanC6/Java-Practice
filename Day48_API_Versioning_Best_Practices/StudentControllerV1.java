package com.example.versioning.controller;

import com.example.versioning.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerV1 {

    @GetMapping("/api/v1/student")
    public StudentDTO getStudentV1() {
        return new StudentDTO(1, "Arpan", "arpan@gmail.com");
    }
}

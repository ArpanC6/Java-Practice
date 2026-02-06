package com.example.versioning.controller;

import com.example.versioning.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerV2 {

    @GetMapping("/api/v2/student")
    public StudentDTO getStudentV2() {
        return new StudentDTO(1, "Arpan Chakraborty", "arpan.backend@gmail.com");
    }
}

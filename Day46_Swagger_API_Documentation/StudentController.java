package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Tag(name = "Student APIs", description = "CRUD APIs for Student")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Operation(summary = "Get all students")
    @GetMapping
    public List<String> getAllStudents() {
        return Arrays.asList("Arpan", "Rahul", "Amit");
    }

    @Operation(summary = "Add a new student")
    @PostMapping
    public String addStudent(@RequestBody String name) {
        return "Student added: " + name;
    }
}

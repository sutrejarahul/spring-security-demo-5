package com.example.controller;

import com.example.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Rahul", 1),
            new Student(2,"Jay", 2)
    ));

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("add")
    public void addStudent(@RequestBody Student student) {
       students.add(student);
    }
}

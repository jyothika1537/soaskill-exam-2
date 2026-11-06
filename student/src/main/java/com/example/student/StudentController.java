package com.example.student;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add")
    public student add(@RequestBody student s) {
        return service.save(s);
    }
}
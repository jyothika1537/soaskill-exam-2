package com.example.student;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public student save(student s) {
        return repo.save(s);
    }
}
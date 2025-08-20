package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private StudentService repo;
    @PostMapping("/insert")
    public Student insertStudent(@RequestBody Student s){
        return repo.saveStudent(s);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllStudents(){
        return new ResponseEntity<>(repo.getAll(), HttpStatus.CREATED);

    }


}

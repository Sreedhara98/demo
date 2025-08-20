package com.example.service;

import com.example.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student s);
    public List<Student> getAll();
}

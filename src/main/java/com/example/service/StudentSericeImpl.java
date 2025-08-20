package com.example.service;

import com.example.model.Student;
import com.example.repositry.StduentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentSericeImpl implements StudentService{
    @Autowired
    private StduentRepo repo;


    @Override
    public Student saveStudent(Student s) {
        return repo.save(s);

    }

    @Override
    public List<Student> getAll() {
        return repo.findAll();
    }

}

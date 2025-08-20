package com.example.repositry;


import com.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StduentRepo  extends JpaRepository<Student,Integer> {
}

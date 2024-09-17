package com.g3appdev.chickenproben.ServiceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3appdev.chickenproben.EntityAPI.StudentEntity;
import com.g3appdev.chickenproben.RepositoryAPI.StudentRepository;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    
    public StudentService() {
        super();
    }

    // Create or save a new student
    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    // Read all students
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
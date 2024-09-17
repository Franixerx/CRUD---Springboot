package com.g3appdev.chickenproben.ControllerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.g3appdev.chickenproben.EntityAPI.StudentEntity;
import com.g3appdev.chickenproben.ServiceAPI.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Endpoint to return a greeting message
    @GetMapping("/printHello")
    public String print() {
        return "Hello, Piolo Frances Enriquez!";
    }

    // Create a new student
    @PostMapping("/addStudent")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    // Read all students
    @GetMapping("/readAllStudents")
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }
}
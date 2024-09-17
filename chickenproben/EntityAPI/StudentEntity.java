package com.g3appdev.chickenproben.EntityAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_Id;
    private String Name;
    private String Email;
    private String Password;
    
    
    public StudentEntity() {
    	super();
    }
    
    public StudentEntity(int student_Id, String Name, String Email, String Password) {
    	super();
    	this.student_Id = student_Id;
    	this.Name = Name;
    	this.Email = Email;
    	this.Password = Password;
    	
    }
    // Getters and Setters
    public int getStudentId() {
        return student_Id;
    }

    public void setStudentId(int studentId) {
        this.student_Id = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

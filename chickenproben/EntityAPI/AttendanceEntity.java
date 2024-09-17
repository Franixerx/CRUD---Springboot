package com.g3appdev.chickenproben.EntityAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class AttendanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int attendanceID;

    @Column(name = "StudentID")
    private int studentID;

    @Column(name = "ClassID")
    private int classID;

    @Column(name = "Password")
    private String password;

    @Column(name = "Date", columnDefinition = "DATE")
    private LocalDate date;

    @Column(name = "Status")
    private String status;

    @Column(name = "SignInTime", columnDefinition = "DATETIME")
    private LocalDateTime signInTime;

    @Column(name = "SignOutTime", columnDefinition = "DATETIME")
    private LocalDateTime signOutTime;

    public AttendanceEntity() {
        // Default constructor
    }

    // Constructor with parameters
    public AttendanceEntity(int attendanceID, int studentID, int classID, String password, LocalDate date, String status, LocalDateTime signInTime, LocalDateTime signOutTime) {
        super();
        this.attendanceID = attendanceID;
        this.studentID = studentID;
        this.classID = classID;
        this.password = password;
        this.date = date;
        this.status = status;
        this.signInTime = signInTime;
        this.signOutTime = signOutTime;
    }

    // Getters and Setters
    public int getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(int attendanceID) {
        this.attendanceID = attendanceID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(LocalDateTime signInTime) {
        this.signInTime = signInTime;
    }

    public LocalDateTime getSignOutTime() {
        return signOutTime;
    }

    public void setSignOutTime(LocalDateTime signOutTime) {
        this.signOutTime = signOutTime;
    }
    
}
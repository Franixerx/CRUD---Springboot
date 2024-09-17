package com.g3appdev.chickenproben.ControllerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.g3appdev.chickenproben.EntityAPI.AttendanceEntity;
import com.g3appdev.chickenproben.ServiceAPI.AttendanceService;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    
    @GetMapping("/printHelloAtt")
    public String print() {
        return "Hello, Piolo Frances Enriquez!";
    }

    
    @PostMapping("/addAttendance")
    public AttendanceEntity createAttendance(@RequestBody AttendanceEntity attendance) {
        return attendanceService.createAttendance(attendance);
    }

    
    @GetMapping("/readAllAttendances")
    public List<AttendanceEntity> getAllAttendance(){
        return attendanceService.getAllAttendance();
    }
}

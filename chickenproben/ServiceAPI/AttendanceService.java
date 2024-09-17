package com.g3appdev.chickenproben.ServiceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3appdev.chickenproben.EntityAPI.AttendanceEntity;
import com.g3appdev.chickenproben.RepositoryAPI.AttendanceRepository;

import java.util.List;


@Service
public class AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    public AttendanceService() {
        super();
    }

    // Create or save a new attendance record
    public AttendanceEntity createAttendance(AttendanceEntity attendance) {
        return attendanceRepository.save(attendance);
    }

    // Read all attendance records
    public List<AttendanceEntity> getAllAttendance() {
        return attendanceRepository.findAll();
    }
}

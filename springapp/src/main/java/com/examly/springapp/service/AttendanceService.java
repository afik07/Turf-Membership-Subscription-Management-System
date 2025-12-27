package com.examly.springapp.service;
import com.examly.springapp.model.Attendance;
import java.util.List;
public interface AttendanceService {
    Attendance saveAttendance(Attendance attendance);
    Attendance getAttendanceById(Long id);
    List<Attendance> getAllAttendances();
    Attendance updateAttendance(Long id, Attendance attendance);
    void deleteAttendance(Long id);
}
package com.examly.springapp.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    @GetMapping("/{id}")
    public String getAttendance(@PathVariable Long id) {
        return "Attendance fetched for id " + id;
    }
}
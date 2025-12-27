package com.examly.springapp.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.Attendance;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}

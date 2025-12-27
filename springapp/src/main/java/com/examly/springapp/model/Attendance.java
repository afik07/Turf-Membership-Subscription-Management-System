package com.examly.springapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Attendance {
    @Id
    private int attendanceId;
    private int memberId;
    private String date;
    private boolean present;
    public int getAttendanceId() {
        return attendanceId;
    }
    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }
    
}






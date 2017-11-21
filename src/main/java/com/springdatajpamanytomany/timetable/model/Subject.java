package com.springdatajpamanytomany.timetable.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="abrev")
    private String abrev;
    @Column(name="subject_name")
    private String subjectName;
    @Column(name="lector_name")
    private String lectorName;
    @Column(name="room_no")
    private String roomNo;
    @Column(name="weekday")
    private String weekday;
    @Column(name="time")
    private String time;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students;

    public Subject(){
    }

    public Subject(String abrev, String subjectName, String lectorName, String roomNo, String weekday, String time) {
        this.abrev = abrev;
        this.subjectName = subjectName;
        this.lectorName = lectorName;
        this.roomNo = roomNo;
        this.weekday = weekday;
        this.time = time;
    }

    public Subject(String abrev, String subjectName, String lectorName, String roomNo, String weekday, String time, Set<Student> students) {
        this.abrev = abrev;
        this.subjectName = subjectName;
        this.lectorName = lectorName;
        this.roomNo = roomNo;
        this.weekday = weekday;
        this.time = time;
        this.students = students;
    }

    // abrev
    public String getAbrev() {
        return abrev;
    }
    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectorName() {
        return lectorName;
    }

    public void setLectorName(String lectorName) {
        this.lectorName = lectorName;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // students
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", abrev='" + abrev + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", lectorName='" + lectorName + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", weekday='" + weekday + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

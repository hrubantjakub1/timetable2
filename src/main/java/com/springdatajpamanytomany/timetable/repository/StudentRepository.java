package com.springdatajpamanytomany.timetable.repository;

import com.springdatajpamanytomany.timetable.model.Student;
import com.springdatajpamanytomany.timetable.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByUserName(String userName);

    //vyhleda studentovy predmety podle zadaneho prihlasovaciho jmena
    @Query("SELECT st.subjects FROM Student st WHERE st.userName = :userName")
    List<Subject> getSubjectsByUserName(@Param("userName") String userName);

    // vyhleda studenta podle prijmeni
    Student findByLastName(String lastname);
}

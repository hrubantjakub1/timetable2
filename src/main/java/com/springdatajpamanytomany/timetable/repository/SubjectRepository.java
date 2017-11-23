package com.springdatajpamanytomany.timetable.repository;


import com.springdatajpamanytomany.timetable.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    Subject findByAbrev(@Param("abrev") String abrev);

    Subject findBySubjectName(@Param("subjectName") String subjectName);

    //Metoda ktera najde studenty podle prihlasovaciho jmena
    List<Subject> findAllByStudents_UserName(String username);

    //metoda vyhleda predmet podle dne v tydnu a casu, kdy se predmet kona
    Subject findByWeekdayAndTime(String weekday, String time);

    Map<Integer, Subject> studentsubject = new HashMap<Integer, Subject>();
}

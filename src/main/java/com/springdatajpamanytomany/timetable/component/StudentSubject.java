package com.springdatajpamanytomany.timetable.component;

import com.springdatajpamanytomany.timetable.model.Student;
import com.springdatajpamanytomany.timetable.model.Subject;
import com.springdatajpamanytomany.timetable.repository.StudentRepository;
import com.springdatajpamanytomany.timetable.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class StudentSubject {

    private Subject subject;

    private Student student;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;

    // jednorazove prihlasi studenta ke zvolenym predmetum podle zkratky predmetu
public void saveAllUserSubjects(String studentovoUsername, String [] allSubjects){
    //
    Set<Subject> subjects = new HashSet<Subject>();
    Student student = studentRepository.findByUserName(studentovoUsername);
    for(int i=0;i<allSubjects.length; i++){
        subject = subjectRepository.findByAbrev(allSubjects[i]);
        subjects.add(subject) ;
    }
    if(student != null){
        student.setSubjects(subjects);
    }
}

    // prihlasi studenta na zvoleny predmet zadavame zkratku predmetu a prihlasovaci jmeno

    // sign up student to subject
    public void saveOneUserSubject(String studentname, String subjectname){
        Set<Subject> subjects = new HashSet<Subject>();

        studentRepository.findByUserName(studentname);
        subject = subjectRepository.findByAbrev(subjectname);
        subjects.add(subject);
        student.setSubjects(subjects);
    }

    // vraci dobu, po kterou probiha vyucovaci hodina
    public List<String> timeFunction() {
        List<String> timeList = new ArrayList<String>();
        timeList.add("9:00-11:20");
        timeList.add("11:30-13:00");
        timeList.add("14:00-15:30");

        return timeList;
    }

    // funkce vraci dny v tydnu
    public List<String> weekdayFunction() {
        List<String> weekdaysList = new ArrayList<String>();

        weekdaysList.add("PO");
        weekdaysList.add("UT");
        weekdaysList.add("ST");
        weekdaysList.add("CT");
        weekdaysList.add("PA");

        return weekdaysList;
    }
}



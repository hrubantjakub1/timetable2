package com.springdatajpamanytomany.timetable.view;

import com.springdatajpamanytomany.timetable.component.StudentSubject;
import com.springdatajpamanytomany.timetable.model.Subject;
import com.springdatajpamanytomany.timetable.repository.StudentRepository;
import com.springdatajpamanytomany.timetable.repository.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ViewTimetable {
    private static final Logger log = LoggerFactory.getLogger(ViewTimetable.class);

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentSubject studentSubject;
    
    @Autowired
    SubjectRepository subjectRepository;

    public void ViewStudentTimetable(String username){
        //principem metody je ze se seznam predmetu studenta nacte do hashmap. Kazdy predmet lze vyhledat podle jeho id
        //Predmety je potreba ulozit do kalendare. Vzdy se vyhleda predmet podle dne a tydnu 
        // a pak se id predmetu vyhleda vhodny predmet ulozeny v mape

               List<String> week = studentSubject.weekdayFunction();
               List<String> time = studentSubject.timeFunction();

        Map<Integer,Subject> studentSubjectAndItsId = new HashMap<Integer, Subject>();

        List<Subject> studentSubjectList = studentRepository.getSubjectsByUserName(username);
        studentSubjectList.forEach(subject -> studentSubjectAndItsId.put(subject.getId(),subject));

        // prvni radek vypise seznam hodin do rozvrhu

        time.forEach(lesson->{
            System.out.format("%28s", lesson);

        });
        System.out.println();

            // od druheho radku se vypisuje poporadku den v tydnu a potom jednotlive predmety studenta

       week.forEach(day->{
           time.forEach(lesson-> {
               System.out.print(day);
               Subject subject = subjectRepository.findByWeekdayAndTime(day, lesson);
               if (subject != null){
                   System.out.format("%28s", subject.getSubjectName());
               }
               else
               {
                   System.out.print("                            ");
               }
           });
       });
    }

    public void ViewTwoStudentsSubjects(){

    }

    public void ViewAllStudentsSubjects(String [] allUsernames){


    }

    public void ViewTwoStudentsFreeTime(String username, String username2){


    }



}
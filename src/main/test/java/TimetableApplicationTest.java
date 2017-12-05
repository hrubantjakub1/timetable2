//import com.springdatajpamanytomany.timetable.model.Student;
//import com.springdatajpamanytomany.timetable.model.Subject;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class TimetableApplicationTest {
//    public void Test(){
//        Student jack = studentRepository.findByUserName("tomanfrantisek");
//        Student peter = studentRepository.findByUserName("palmadavid");
//
//        Subject math = subjectRepository.findByAbrev("PST");
//        Subject computer = subjectRepository.findByAbrev("HWB");
//
//		/*subjectRepository.save(math);
//		subjectRepository.save(computer);*/
//
//        Set<Subject> subjects = new HashSet<Subject>();
//        subjects.add(math);
//        subjects.add(computer);
//
//        jack.setSubjects(subjects);
//        peter.setSubjects(subjects);
//
//        studentRepository.save(jack);
//        studentRepository.save(peter);
//
//
//        Set<Student> students = new HashSet<Student>();
//        students.add(jack);
//        students.add(peter);
//
//        math.setStudents(students);
//        computer.setStudents(students);
//
//        subjectRepository.save(math);
//        subjectRepository.save(computer);
//
//        // vyhledej studenty podle username a pridej studentum jednorazove vsechny predmety
//        String[] abrevArray1 = new String[]{"PST", "HWB", "SSB", "SI2.3", "SP2.1", "OOP"};
//        String[] abrevArray2 = new String[]{"PST", "SSB", "SI1.2", "SI2.3", "SP2.1", "KOM", "OOP"};
//        String[] abrevArray3 = new String[]{"PST", "SSB", "SI1.2", "SI2.3", "KOM", "OOP"};
//        String[] abrevArray4 = new String[]{"HWB", "SSB", "SI1.2", "SI2.3", "SP2.1", "KOM"};
//        String[] abrevArray5 = new String[]{"PST", "HWB", "SSB", "SI2.3", "SP2.1", "KOM"};
//
//        log.info("uloz studentum veselyvojtech, tepalbob palmadavid kolinskypetr a tepladavid jejich predmety:");
//        studentSubject.saveAllUserSubjects("veselyvojtech", abrevArray1);
//        studentSubject.saveAllUserSubjects("tepalbob", abrevArray2);
//        studentSubject.saveAllUserSubjects("palmadavid", abrevArray3);
//        studentSubject.saveAllUserSubjects("kolinskypetr", abrevArray4);
//        studentSubject.saveAllUserSubjects("tepalbob", abrevArray5);
//
//        List<Student> studentLst = studentRepository.findAll();
//        log.info("===================Students info:==================");
//        studentLst.forEach(student -> log.info(student.toString()));
//
//        List<Subject> subLst = subjectRepository.findAll();
//        log.info("===================Students info:==================");
//        subLst.forEach(subject -> log.info(subject.toString()));
//
//        List<Subject> subLst1 = subjectRepository.findAllByStudents_UserName("palmadavid");
//        log.info("===================Students subjects info:==================");
//        subLst1.forEach(subject -> log.info(subject.toString()));
//
//        Student subLst2 = studentRepository.findByUserName("veselyvojtech");
//        log.info("===================Students info:==================");
//        log.info(subLst2.toString());
//
//        log.info("====================find by abrev===================");
//        Subject subjectx = subjectRepository.findByAbrev("PST");
//        log.info(subjectx.toString());
//
//        log.info("===================find by subject name:==================");
//        Subject subjectList2 = subjectRepository.findBySubjectName("Hardwarová bezpečnost");
//        log.info(subjectList2.toString());
//
//        log.info("===================find by subject name:==================");
//        List<Subject> subjectList3 = studentRepository.getSubjectsByUserName("tepalbob");
//        subjectList3.forEach(subject -> log.info(subject.toString()));
//
//        // viewTimetable.ViewStudentTimetable("kolinskypetr");
//
//        List<String> week = studentSubject.weekdayFunction();
//        List<String> time = studentSubject.timeFunction();
//
//        Subject subject = subjectRepository.findByWeekdayAndTime(week.get(3),time.get(3));
//    }
//}

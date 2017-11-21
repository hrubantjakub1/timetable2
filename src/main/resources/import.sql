-- import dat do databaze, tabulka student a predmet

INSERT INTO student (user_name, first_name, last_name, email) VALUES ('tomanfrantisek','Frantisek', 'Toman', 'tomanfrantisek@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('palmadavid','David', 'Palma','palmadavid@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('dobkovamichaela','Michaela', 'Dobkova','dobkovamichaela@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('kolinskypetr', 'Petr', 'Kolinsky', 'kolinskypetr@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('tepalbob', 'Bob', 'Tepal', 'tepalbob@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('veselyvojtech', 'Milan', 'Vesely', 'veselyvojtech@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('limouckakrystyna','Krystyna','Limoucka','limouckakrystyna@email.cz');
INSERT INTO student (user_name, first_name, last_name, email) VALUES ('mikyskapavel', 'Pavel', 'Mikyska', 'mikyskapavel@email.cz');

INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('PST', 'Pravděpodobnost a statistika', 'Vašata D', 'T9: 350', 'PO', '9:00-11:20');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('HWB', 'Hardwarová bezpečnost', 'Buček J', 'T9:301', 'PO', '11:30-13:00');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('SSB', 'Systémová a síťová bezpečnost', 'Smítka J', 'T9:344', 'UT', '14:00-15:30');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('SI1.2', 'Softwarové inženýrství I', 'Mlejnek J', 'T9: 350', 'UT', '9:00-11:20');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('SI2.3', 'Softwarové inženýrství 2', 'Mlejnek J', 'T9: 350', 'ST', '11:30-13:00');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('SP2.1', 'Softwarový týmový projekt 2', 'Mlejnek J', 'T9:301', 'ST', '14:00-15:30');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('KOM', 'Konceptuální modelování', 'Ryant I', 'T9: 350', 'CT', '9:00-11:20');
INSERT INTO subject (abrev, subject_name, lector_name, room_no, weekday, time) VALUES ('OOP', 'Object-Oriented Programming', 'Ryant I', 'T9:301', 'PA', '11:30-13:00');
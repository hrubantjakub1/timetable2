#timetable2

Timetable application allows to every student to add, to edit or to remove subjects from his timetable.

Timetable is Spring Data Jpa based application. Hibernate JPA is simplified by Spring Data and automatically configured by Spring Boot. It uses Hikari connection pool to connect to database.

#1. Project Structure
1. Spring Data 1.13.8.RELEASE 
2. Hibernate 5 
3. MySQL Workbench Community (GPL) for Windows version 6.3.9
4. mysql:mysql-connector-java:5.1.442 
5. HikariCP 2.6 
6. Maven 
7. Java 8 
8. Spring Boot 1.5.8.RELEASE

#2. Java Persistence API - JPA
Using Spring Data JPA Crud repository interface simplify usage of entitymanager and query interface. Entity manager provide basic crud operations like persist, remove etc. Spring Data Jpa provide simplified implementation like findAll(), findOne(), findByFirstname() etc.
Using Spring Boot, no persistance.xml is needed. Classes are configured automatically.

#3. Configuration + Database Inialization
Configure Mysql data source, HikariCP and show Hibernate query

#4. If data.sql and schema.sql is found in the classpath, Hibernate will load it automatically

#5.Spring Boot Starter 

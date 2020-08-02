This app mimics a portal and management system used by universities in the management of students, classes, instructors, etc...

Tech stack
----------------
Front-end: GSP (Grails server pages)
Back-end: Groovy/Grails
Database: H2
Deployement: Gradle

Models
-----------------
User (student, instructor, administrator)
Department
Degree
Class
Building
Room
Semester

Prerequisites
------------------
JAVA SDK
SDKMAN  (used to manage grails installations and versions)
Grails


Running the application
-------------------------
1. Navigate to the root directory (universitybuilder)
2. > grails
3. grails> run-app

(navigate to localhost:8080)


References
-------------------------
http://docs.grails.org/latest/guide/gettingStarted.html
http://guides.grails.org/creating-your-first-grails-app/guide/index.html?utm_campaign=Groovy%2BCalamari&utm_medium=web&utm_source=Groovy_Calamari66
MVC Design Pattern: https://docs.microsoft.com/en-us/aspnet/core/mvc/overview?view=aspnetcore-3.1
View Layer: 
        https://gsp.grails.org/latest/guide/index.html
        https://gsp.grails.org/latest/guide/index.html
Database Layer:    
        http://gorm.grails.org/6.0.x/hibernate/manual/
        http://grails.asia/grails-tutorial-for-beginners-introduction-to-gorm
        http://www.h2database.com/html/main.html
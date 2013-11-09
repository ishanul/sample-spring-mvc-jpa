sample-spring-mvc-jpa
=====================

This is sample project for Spring MVC , JPA, Hibernate with Maven

Download zip or clone the project using git

Then run mvn clean and mvn install commands

you can run generate SpringMVCJPA.war on tomcat 

e.g http://localhost:8080/SpringMVCJPA/welcome.htm 

you should have below mysql table with your database

mysql> select * from contact;
+----+--------+------+
| id | name   | age  |
+----+--------+------+
|  1 | abc123 |   28 |
|  2 | abc123 |   28 |
|  3 | abc123 |   28 |
+----+--------+------+


Please change database name, username and password in persistence.xml


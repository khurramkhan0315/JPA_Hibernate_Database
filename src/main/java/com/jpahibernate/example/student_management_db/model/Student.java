package com.jpahibernate.example.student_management_db.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data  // automatic generate getters and setters
@Entity // it refers that it is model or entity class which directly represents the database table
@Table(name = "Student")  //it will create the table inside the database name Student
public class Student {
    @Id // it is primary key.it can not take duplicate values
    @Column(name = "student_id")//it will create a column in database with name student_id
    private int studentId;

    @Column(name ="name" , nullable = false) // it is mandatory field and cannot be  null
    private String name;

    @Column(name = "email" , nullable = false , unique=true) // is will take unique values
    private String email;
    @Column
    private String grade;

    @Column
    private String dob;

    @Column(name = "passward" ,nullable=false ,unique = true)
    private String passward;
}

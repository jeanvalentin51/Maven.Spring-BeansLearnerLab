package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.Student;
import com.beanslearner.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    // this is static; think menu based on different profiles

    @Bean(name = "current students") // used in classroom config qualifier
    public Students currentStudents(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1L, "Zoe"));
        studentList.add(new Student(2L,"Sandy"));

        return new Students(studentList);
    }

    @Bean(name = "previous students")
    public Students previousStudents(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3L,"Mike"));
        studentList.add(new Student(4L,"Ben"));

        return new Students(studentList);
    }
}

package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.Classroom;
import com.beanslearner.demo.models.Instructors;
import com.beanslearner.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Bean
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors,students);
    }

    @Bean
    public Classroom previousCohort (Instructors instructors, Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }
}

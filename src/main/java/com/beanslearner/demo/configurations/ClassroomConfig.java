package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.Classroom;
import com.beanslearner.demo.models.Instructors;
import com.beanslearner.demo.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    // qualifiers match the bean names in instructors/students config
    // bellow bean name will be used for testing

    @Bean (name = "currentCohort")
    public Classroom currentCohort(@Qualifier("tcUkInstructors") Instructors instructors, @Qualifier("current students") Students students){
        return new Classroom(instructors,students);
    }

    @Bean(name = "previousCohort")
    public Classroom previousCohort (@Qualifier("tcUsaInstructors") Instructors instructors, @Qualifier("previous students") Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }
}

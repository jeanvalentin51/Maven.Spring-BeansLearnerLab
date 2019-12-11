package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.Instructor;
import com.beanslearner.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {

    @Bean
    public Instructors tcUsaInstructors(){
        return new Instructors();
    }

    @Bean
    public Instructors tcUkInstructors(){
        return new Instructors();
    }

    @Bean
    @Primary
    public Instructors instructors(){
        return new Instructors();
    }
}

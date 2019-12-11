package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.Instructor;
import com.beanslearner.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorConfig {

    // this is static; think menu based on different profiles

    @Bean(name = "tcUsaInstructors") // used in classroom config qualifier
    public Instructors tcUsaInstructors(){
        ArrayList<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(4L,"Joe"));
        instructorList.add(new Instructor(5L,"Jack"));
        return new Instructors(instructorList);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        ArrayList<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(6L, "Zack"));
        instructorList.add(new Instructor(7L,"Loo"));
        return new Instructors(instructorList);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors(){
        ArrayList<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(9L,"Dolio"));
        instructorList.add(new Instructor(10L,"Roberto"));
        return new Instructors(instructorList);
    }
}

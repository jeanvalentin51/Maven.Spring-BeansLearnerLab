package com.beanslearner.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previous students")
    private Students students;

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors instructors;

    private double totalNumberOfHours = 1200.0;

    @PostConstruct // this method must be executed before the class is put in IoC container
    public void executeBootcamp(){
        for(Instructor each : instructors){
           each.lecture(students,(students.size()* totalNumberOfHours)/instructors.size());
        }
    }

    public Students getstudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}

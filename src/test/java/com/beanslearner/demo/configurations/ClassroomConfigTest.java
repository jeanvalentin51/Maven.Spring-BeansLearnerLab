package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort") // from Classroom config
    private Classroom currentCohort;


    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void previousCohortTest(){

        Assert.assertTrue(previousCohort.getInstructors().findById(4L).getName().equals("Joe"));
        Assert.assertTrue(previousCohort.getStudents().findById(3L).getName().equals("Mike"));
    }

    @Test
    public void currentCohortTest(){
        Assert.assertTrue(currentCohort.getInstructors().findById(6L).getName().equals("Zack"));
        Assert.assertTrue(currentCohort.getStudents().findById(1L).getName().equals("Zoe"));
    }
}
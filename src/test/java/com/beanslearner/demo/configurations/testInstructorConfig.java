package com.beanslearner.demo.configurations;

import com.beanslearner.demo.models.Instructors;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class testInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors usaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors ukInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    void tcUsaInstructors() {
        Assert.assertTrue(usaInstructors.findById(4L).getName().equals("Joe"));
    }

    @Test
    void tcUkInstructors() {
        Assert.assertTrue(ukInstructors.findById(6L).getName().equals("Zack"));
    }

    @Test
    void instructors() {
        Assert.assertTrue(instructors.findById(9L).getName().equals("Dolio"));
    }
}
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
class testStudentConfig {

    @Autowired
    @Qualifier("current students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previous students")
    private Students previousStudents;

    @Test
    void testCurrentStudents() {
        Assert.assertTrue(currentStudents.findById(1L).getName().equals("Zoe"));
    }

    @Test
    void testPreviousStudents() {
        Assert.assertTrue(previousStudents.findById(4L).getName().equals("Ben"));
    }
}
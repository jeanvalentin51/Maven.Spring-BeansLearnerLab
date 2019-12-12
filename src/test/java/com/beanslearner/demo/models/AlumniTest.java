package com.beanslearner.demo.models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    void testExecuteBootcamp() {
        for (Student each : alumni.getstudents()){
            Assert.assertEquals(1200.0,each.getTotalStudyTime(),0.0);
        }
    }

}
package com.beanslearner.demo.models;

import com.beanslearner.demo.repositories.Learner;
import com.beanslearner.demo.repositories.Teacher;

import java.util.Iterator;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }


    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {

        Double numberOfHoursPerLearner;
        Iterator<? extends Learner> iterator = learners.iterator();
        int length = 0;

        while (iterator.hasNext()){
            length ++;
            iterator.next();
        }
        numberOfHoursPerLearner = numberOfHours/length;

        for (Learner each : learners){
            each.learn(numberOfHoursPerLearner);
        }
    }
}

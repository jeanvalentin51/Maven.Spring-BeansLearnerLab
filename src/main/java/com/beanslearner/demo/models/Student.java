package com.beanslearner.demo.models;

import com.beanslearner.demo.repositories.Learner;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}

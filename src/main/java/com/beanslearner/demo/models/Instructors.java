package com.beanslearner.demo.models;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor> {


    public Instructors(List<Instructor> personList) {
        super(personList);
    }

    public Instructors(Instructor...instructors){
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return findAll().iterator();
    }
}

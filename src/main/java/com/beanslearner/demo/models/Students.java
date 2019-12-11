package com.beanslearner.demo.models;

import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {


    public Students(List<Student> personList) {
        super(personList);
    }

    public Students(Student...students){
        super(students);
    }

    @Override
    public Iterator<Student> iterator() {

        return findAll().iterator();
    }

}

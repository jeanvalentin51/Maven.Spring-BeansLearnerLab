package com.beanslearner.demo.models;

import com.beanslearner.demo.repositories.Teacher;

public class Classroom {

    private Instructors instructors;
    private Students students;

    public Classroom (Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture (Teacher teacher, Double numberOfHours){
        teacher.lecture(this.students.personList,numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

}

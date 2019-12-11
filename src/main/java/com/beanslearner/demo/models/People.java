package com.beanslearner.demo.models;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(PersonType...students) {
        this.personList = Arrays.asList(students);
    }

    public void add (PersonType person){
        this.personList.add(person);
    }

    public void remove (PersonType person){
        this.personList.remove(person);
    }

    public Integer size (){
        return this.personList.size();
    }

    public void clear (){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> allPersons){
        for (PersonType each : allPersons){
            this.personList.add(each);
        }
    }

    public PersonType findById (Long id){

        for (PersonType each : this.personList){
            if (each.getId() == id) return each;
        }
        return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }

}

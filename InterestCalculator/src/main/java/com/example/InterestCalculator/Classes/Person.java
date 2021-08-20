package com.example.InterestCalculator.Classes;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int personId;

    @NonNull
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public Person() {};

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}

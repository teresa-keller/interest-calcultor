package com.example.InterestCalculator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int personId;
    private String personName;
}

package com.example.InterestCalculator.Data;


import com.example.InterestCalculator.Classes.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}

package com.example.InterestCalculator.Data;

import com.example.InterestCalculator.Classes.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {
}

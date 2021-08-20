package com.example.InterestCalculator;

import com.example.InterestCalculator.Classes.CreditCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterestCalculatorApplication {

	public static void main(String[] args) {
		CreditCard testCard = new CreditCard("Visa");

		System.out.println(testCard.creditCardInterest(100));

		SpringApplication.run(InterestCalculatorApplication.class, args);
	}



}

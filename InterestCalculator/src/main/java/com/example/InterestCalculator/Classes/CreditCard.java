package com.example.InterestCalculator.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreditCard {
//    Visa gets 10%
//    MC gets 5% interest
//    Discover gets 1% interest

    @Id
    @GeneratedValue
    private int cardId;
    private double interest;
    private String cardType;

    public CreditCard(String cardType) {
        this.cardType = cardType;
    }
    public CreditCard(){};

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardId() {
        return cardId;
    }

    public double creditCardInterest(double amount) {
        if (cardType.equals("Visa")) {
            interest = amount * .1;
        } else if (cardType.equals("MC")) {
            interest = amount * .05;
        } else if (cardType.equals("Discover")) {
            interest = amount * .01;
        } else {
            System.out.println("Invalid card");
        }

        return interest;
    }
}

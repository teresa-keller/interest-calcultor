package com.example.InterestCalculator.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity

public class Wallet {

    @Id
    @GeneratedValue
    private int walletID;

    @OneToMany
    private List<CreditCard> creditCards;

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public int getWalletID() {
        return walletID;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}

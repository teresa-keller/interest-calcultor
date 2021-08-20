package com.example.InterestCalculator;

import javax.persistence.*;
import java.util.List;

@Entity

public class Wallet {

    @Id
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

package com.example.InterestCalculator;

import javax.persistence.Id;
import java.util.List;

public class Wallet {

    @Id
    private int walletID;
    private List<CreditCard> creditCards;
}

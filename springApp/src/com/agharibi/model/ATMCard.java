package com.agharibi.model;

public class ATMCard implements Card {
    @Override
    public String cardDetails() {
        return "A new ATM card has been issued";
    }
}

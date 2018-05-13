package com.agharibi.model;

public class CreditCard implements Card {

    @Override
    public String cardDetails() {
        return "A new credit card has been issued";
    }
}

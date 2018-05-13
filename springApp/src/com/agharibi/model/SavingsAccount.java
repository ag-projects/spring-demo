package com.agharibi.model;

public class SavingsAccount implements Account {

    private Card card;

    public SavingsAccount(Card card) {
        this.card = card;
    }

    @Override
    public String createAccount() {
        return "A new savings account have been created";
    }

    @Override
    public String cardDetails() {
        return card.cardDetails();
    }
}

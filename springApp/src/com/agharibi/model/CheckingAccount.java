package com.agharibi.model;

public class CheckingAccount implements Account {

    private Card card;

    public CheckingAccount(Card card) {
        this.card = card;
    }

    @Override
    public String createAccount() {
        return "A new checking account has been created";
    }

    @Override
    public String cardDetails() {
        return card.cardDetails();
    }
}

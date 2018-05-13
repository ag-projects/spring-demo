package com.agharibi.model;

public class CheckingAccount implements Account {

    private Card card;

    @Override
    public String createAccount() {
        return "A new checking account has been created";
    }

    @Override
    public String cardDetails() {
        return card.cardDetails();
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

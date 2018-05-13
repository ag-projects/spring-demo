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

    public void onInit() {
        System.out.println("OnInit method in CheckingAccount has been invoked");
    }

    public void onDestroy() {
        System.out.println("OnDestroy method in CheckingAccount has been invoked");
    }
}

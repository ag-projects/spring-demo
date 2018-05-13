package com.agharibi.model;

public class CheckingAccount implements Account {
    @Override
    public String createAccount() {
        return "A new checking account has been created";
    }
}

package com.agharibi.driver;

import com.agharibi.model.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(BankApplicationConfig.class);
        Account checkingAccount = context.getBean("checkingAccount", Account.class);

        System.out.println(checkingAccount.createAccount());
        System.out.println(checkingAccount.cardDetails());

    }
}

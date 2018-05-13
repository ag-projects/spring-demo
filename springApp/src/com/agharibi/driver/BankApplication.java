package com.agharibi.driver;

import com.agharibi.model.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contextSavings = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account savings = contextSavings.getBean("mySavings", Account.class);

        // Account savings = new SavingsAccount();
        System.out.println(savings.createAccount());
        System.out.println(savings.cardDetails());

        ClassPathXmlApplicationContext contextChecking = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account checking = contextChecking.getBean("myChecking", Account.class);

        // Account checking = new CheckingAccount();
        System.out.println(checking.createAccount());
        System.out.println(checking.cardDetails());
    }
}

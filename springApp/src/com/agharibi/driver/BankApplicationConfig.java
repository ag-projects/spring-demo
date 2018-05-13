package com.agharibi.driver;

import com.agharibi.model.Card;
import com.agharibi.model.CheckingAccount;
import com.agharibi.model.CreditCard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class BankApplicationConfig {



    @Bean
    public CreditCard creditCard () {
        return new CreditCard();
    }

    @Bean(initMethod = "onInit", destroyMethod = "onDestroy")
    @Scope("prototype")
    public CheckingAccount checkingAccount() {
        return new CheckingAccount();
    }
}

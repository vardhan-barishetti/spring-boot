package com.example.spring_boot_core.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OracleLoginService implements LoginService{
    @Override
    public void login() throws InterruptedException {
        System.out.println("Logging using Oracle database");
        System.out.println("wait....");
        Thread.sleep(1000);
        System.out.print("working...");
        Thread.sleep(1000);
    }

    @Override
    public void logout() {

    }
}

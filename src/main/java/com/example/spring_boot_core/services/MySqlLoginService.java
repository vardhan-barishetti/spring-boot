package com.example.spring_boot_core.services;

import org.springframework.stereotype.Component;

@Component
public class MySqlLoginService implements LoginService{

    @Override
    public void login() throws InterruptedException {
        System.out.println("Logging using mysql database");
        System.out.println("wait....");
        Thread.sleep(1000);
        System.out.print("working...");
        Thread.sleep(1000);

    }

    @Override
    public void logout() {
        System.out.println("Log out using mysql database");

    }
}

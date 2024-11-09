package com.example.spring_boot_core.controllers;

import com.example.spring_boot_core.services.LoginService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

    public LoginService loginService;

    public HomeController(@Qualifier("oracleLoginService") LoginService loginService) {
        this.loginService = loginService;
    }

    public void loginUser() throws InterruptedException {
        loginService.login();
        System.out.println("logged in");
    }

    public void logOut(){
        loginService.logout();
        System.out.print("Logout");
    }
}

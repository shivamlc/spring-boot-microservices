package com.sg.bank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/welcome")
    public String welcome()
    {
        return "Hello! Welcome to accounts api";
    }

}

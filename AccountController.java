package com.example.idms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountRepository AccountRepository;

    @Autowired
    public AccountController(AccountRepository AccountRepository) {
        this.AccountRepository = AccountRepository;
    }

    @GetMapping("/all")
    public List<Account> getAllAccount() {
        return AccountRepository.findAll();
    }
}

package com.example.cnab.samplems2.controllers;

import com.example.cnab.samplems2.models.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    private final String URL = "http://localhost:8040/";
    @GetMapping("/accounts")
    public Account[] getAccounts(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Account[]> responseEntity = restTemplate.getForEntity(URL+"account",Account[].class);
        return responseEntity.getBody();
    }
}

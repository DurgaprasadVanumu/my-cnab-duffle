package com.example.cnab.samplems1.controllers;

import com.example.cnab.samplems1.models.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    private final ArrayList<Account> list=new ArrayList<>();
    @PostMapping("/account")
    public String createAccount(@RequestBody Account account){
        System.out.println("Account Object:"+account.toString());
        try{
            if(list.isEmpty()){
                account.setAccountId(1);
            }else{
                account.setAccountId(1 + list.get(list.size()-1).getAccountId());
            }
            list.add(account);
            return "success";
        }catch(Exception e){

        }
        return "fail";
    }
    @GetMapping("/account")
    public List<Account> getAccounts(){
        return this.list;
    }
}

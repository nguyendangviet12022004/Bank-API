package com.viet.bankapi.service;

import com.viet.bankapi.dto.AccountDto;
import com.viet.bankapi.entity.Account;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    List<AccountDto> getAllAccounts();

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    AccountDto deleteAccount(Long id);
}

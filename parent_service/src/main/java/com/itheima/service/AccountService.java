package com.itheima.service;

import com.itheima.domain.Account;


public interface AccountService {

    void updateAccount(Account account);

    void transfer(Integer old_id, Integer new_id, Double money);

    Account findOne(Integer id);

    void saveAccount(Account account);
}

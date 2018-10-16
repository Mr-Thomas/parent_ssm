package com.itheima.dao;

import com.itheima.domain.Account;

public interface AccountDao {

    void updateAccount(Account account);

    void saveAccount(Account account);

    Account findOne(Integer id);
}

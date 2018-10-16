package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;
    @Override
    public void updateAccount(Account account) {
        dao.updateAccount(account);
    }
}

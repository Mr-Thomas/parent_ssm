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
        dao.saveAccount(account);
    }

    /**
     * 转账操作
     *
     * @param old_id
     * @param new_id
     * @param money
     */
    @Override
    public void transfer(Integer old_id, Integer new_id, Double money) {
        //根据id查询用户Account
        Account old_Account = dao.findOne(old_id);
        Account new_Account = dao.findOne(new_id);
        //设置money
        old_Account.setMoney(old_Account.getMoney() - money);
        new_Account.setMoney(new_Account.getMoney() + money);
        //保存账户
        dao.updateAccount(old_Account);
        //制造异常 测试事务控制
//        int i = 1 / 0;

        dao.updateAccount(new_Account);

    }

    @Override
    public Account findOne(Integer id) {
        return dao.findOne(id);
    }

    @Override
    public void saveAccount(Account account) {
        dao.saveAccount(account);
    }
}

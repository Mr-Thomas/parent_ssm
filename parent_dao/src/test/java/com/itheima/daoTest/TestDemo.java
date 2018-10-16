package com.itheima.daoTest;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void demo(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        AccountDao dao = ac.getBean(AccountDao.class);
        Account account = new Account();
        account.setName("李四");
        account.setMoney(2000d);
        dao.updateAccount(account);
    }
}

package com.ithema.serviceTest;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void Demo(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        Account account = new Account();
        account.setName("李四");
        account.setMoney(3000d);
        accountService.updateAccount(account);
    }
}

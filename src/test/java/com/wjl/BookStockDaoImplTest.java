package com.wjl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @Author: wugege
 * @Date: 2019/8/31 11:16
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class BookStockDaoImplTest {

    BookStockDao bookStockDao ;
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookStockService bookStockService=ctx.getBean(BookStockService.class);


    {


    }

    @Test
    public void updateAccount() {
        bookStockDao.updateAccount("kris",20);
    }

    @Test
    public void findBookPriceByIsbn() {
    }

    @Test
    public void testPurchase() {
        bookStockService.purchar("kris","A01");
    }

    @Test
    public void  testConnect() throws SQLException {

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
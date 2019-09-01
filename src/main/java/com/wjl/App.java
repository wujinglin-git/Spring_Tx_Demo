package com.wjl;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * @Author: wugege
 * @Date: 2019/8/31 11:16
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class App {

    BookStockDaoImpl bookStockDao  = new BookStockDaoImpl();
    ApplicationContext ctx = null;


    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //  bookStockDao = ctx.getBean(BookStockDao.class);
    }

    @Test
    public void updateAccount() {
        bookStockDao.updateAccount("kris",20);
    }

    @Test
    public void findBookPriceByIsbn() {
    }

    @Test
    public void updateBookStock() {
    }

    @Test
    public void  testConnect() throws SQLException {

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
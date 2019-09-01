package com.wjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: wugege
 * @Date: 2019/8/31 10:24
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Repository("bookStockDao")
public class BookStockDaoImpl implements BookStockDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void updateAccount(String username, double money) {
        String sql = "UPDATE account SET balance=balance-? WHERE username=?";
        jdbcTemplate.update(sql,money,username  );
    }

    @Override
    public double findBookPriceByIsbn(String isbn) {
        String sql = "SELECT price FROM book WHERE isbn=?";

        return jdbcTemplate.queryForObject(sql,Double.class,isbn );
    }

    @Override
    public void updateBookStock(String isbn) {
        String sql="UPDATE bookStock SET stock=stock-1 WHERE isbn = ?";
        jdbcTemplate.update(sql,isbn);
    }
}

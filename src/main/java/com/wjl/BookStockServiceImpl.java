package com.wjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wugege
 * @Date: 2019/8/31 14:47
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Service("bookStockService")
public class BookStockServiceImpl implements BookStockService {
    @Autowired
    BookStockDao bookStockDao;
@Transactional
    @Override
    public void purchar(String username, String isbn) {
        //书籍-1
        bookStockDao.updateBookStock(isbn);
        //获取书的价格
        double price = bookStockDao.findBookPriceByIsbn(isbn);
        //钱减少
        bookStockDao.updateAccount(username,price);

    }
}

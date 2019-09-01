package com.wjl;

import org.springframework.stereotype.Repository;

/**
 * @Author: wugege
 * @Date: 2019/8/31 10:19
 * 一给窝哩 giao giao 呀吼
 * 4
 */

public interface BookStockDao {

    public  void updateAccount(String username,double money); //钱减少

    public double findBookPriceByIsbn(String isbn);  //通过ISBN找到书

    public void updateBookStock(String isbn);//书库中的书-1





}

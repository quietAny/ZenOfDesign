package com.cz.zenofdesign.part1.chapter6;

import org.w3c.dom.ls.LSException;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BookStore
 * @date: 2019/7/9  17:18
 * @author: guohao
 * @Description: 书店
 */
public class BookStore {

    private final static List<IBook> books = new ArrayList<>();

    static {
        books.add(new OffNovelBook("天龙八部","金庸",3200));
        books.add(new OffNovelBook("巴黎圣母院","雨果",5600));
        books.add(new OffNovelBook("悲惨世界","雨果",3500));
        books.add(new OffNovelBook("金瓶梅","兰陵笑笑生",4300));

        books.add(new ComputerBook("编程","Think in Java","Brucc Eckel",4300));
    }

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("----------卖出去的书籍----------");
        for (IBook book : books) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" + book.getAuthor() + "\t书籍价格：" + format.format(book.getPrice()/100) +"元");
        }
    }


}

package com.cz.zenofdesign.part1.chapter6;

/**
 * @ClassName: NovelBook
 * @date: 2019/7/9  17:17
 * @author: guohao
 * @Description: 小说
 */
public class NovelBook implements IBook {

    private String name;
    private String author;
    private int price;

    public NovelBook(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}

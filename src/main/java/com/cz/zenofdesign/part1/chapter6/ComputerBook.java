package com.cz.zenofdesign.part1.chapter6;

/**
 * @ClassName: ComputerBook
 * @date: 2019/7/9  17:48
 * @author: guohao
 * @Description:
 */
public class ComputerBook implements IComputerBook{

    private String scope;
    private String name;
    private String author;
    private int price;

    public ComputerBook(String scope, String name, String author, int price) {
        this.scope = scope;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getScope() {
        return this.scope;
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

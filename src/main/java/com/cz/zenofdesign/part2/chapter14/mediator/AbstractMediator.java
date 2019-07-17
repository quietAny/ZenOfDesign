package com.cz.zenofdesign.part2.chapter14.mediator;

/**
 * @ClassName: AbstractMediator
 * @date: 2019/7/11  14:09
 * @author: guohao
 * @Description: 抽象中介类
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    /**
     * 事件方法,处理多个对象之间的关系
     * @param str
     * @param objects
     */
    public abstract void execute(String str,Object...objects);
}

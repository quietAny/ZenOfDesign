package com.cz.zenofdesign.part2.chapter20.iterator;

/**
 * @ClassName: Aggregate
 * @date: 2019/7/12  9:26
 * @author: guohao
 * @Description: 抽象容器
 */
public interface Aggregate {

    public void add(Object object);

    public void remove(Object object);

    public Iterator iterator();
}

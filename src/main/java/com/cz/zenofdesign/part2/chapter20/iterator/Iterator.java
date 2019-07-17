package com.cz.zenofdesign.part2.chapter20.iterator;

/**
 * @ClassName: Iterator
 * @date: 2019/7/12  9:14
 * @author: guohao
 * @Description:
 */
public interface Iterator {

    //遍历到下一个元素
    public Object next();
    //是否到最后一个元素
    public boolean hasNext();
    //删除当前指向的元素
    public boolean remove();
}

package com.cz.zenofdesign.part2.chapter20.iterator;

import java.util.Vector;

/**
 * @ClassName: ConcreteAggregate
 * @date: 2019/7/12  9:27
 * @author: guohao
 * @Description:
 */
public class ConcreteAggregate implements Aggregate{

    private Vector vector = new Vector();

    /**
     * 添加一个元素
     * @param object
     */
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    /**
     * 删除一个元素
     * @param object
     */
    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    /**
     * 遍历所有元素
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}

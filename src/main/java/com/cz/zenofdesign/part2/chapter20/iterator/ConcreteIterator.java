package com.cz.zenofdesign.part2.chapter20.iterator;

import java.util.Vector;

/**
 * @ClassName: ConcreteIterator
 * @date: 2019/7/12  9:17
 * @author: guohao
 * @Description:
 */
public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();

    //定义当前游标
    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if(this.hasNext()){
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}

package com.cz.zenofdesign.part2.chapter20.iterator;

/**
 * @ClassName: Client
 * @date: 2019/7/12  9:31
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        aggregate.add("abc");
        aggregate.add("aaa");
        aggregate.add("123");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

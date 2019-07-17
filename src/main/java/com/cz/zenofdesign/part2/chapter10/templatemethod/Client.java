package com.cz.zenofdesign.part2.chapter10.templatemethod;

/**
 * @ClassName: Client
 * @date: 2019/7/10  13:05
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.templateMethod();

        a = new ConcreteClassB();
        a.templateMethod();
    }
}

package com.cz.zenofdesign.part5.chapter37.nullobject;

/**
 * @ClassName: Dog
 * @date: 2019/7/17  13:29
 * @author: guohao
 * @Description:
 */
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("wang~wang~wang");
    }
}

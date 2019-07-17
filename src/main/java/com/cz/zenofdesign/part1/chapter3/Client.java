package com.cz.zenofdesign.part1.chapter3;

/**
 * @ClassName: client
 * @date: 2019/7/9  15:47
 * @author: guohao
 * @Description: 依赖倒置原则
 */
public class Client {

    public static void main(String[] args) {

        IDriver driver = new Driver(new BMW());
        driver.driver();

        driver = new Driver(new Benz());
        driver.driver();
    }
}

package com.cz.zenofdesign.part2.chapter11.builder;

import com.cz.zenofdesign.part1.chapter3.Benz;

import java.util.ArrayList;

/**
 * @ClassName: Client
 * @date: 2019/7/10  13:27
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABMWModel().run();
        }

        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }

        for (int i = 0; i < 1000000000; i++) {
            director.getBBMWModel().run();
        }

    }
}

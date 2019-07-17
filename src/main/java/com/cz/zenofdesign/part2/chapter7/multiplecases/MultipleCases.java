package com.cz.zenofdesign.part2.chapter7.multiplecases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: MultipleCases
 * @date: 2019/7/10  9:31
 * @author: guohao
 * @Description: 多例模式
 */
public class MultipleCases {

    //1.定义最多产生的实例数量
    private static int maxNum = 2;

    //2.定义一个列表，容纳所有实例
    private static List<MultipleCases> multipleCasesList = new ArrayList<>();

    //3.定义序列号
    private static int count = 0;

    /**
     * 4.生产化所有对象
     */
    static {
        for (int i = 0; i < maxNum; i++) {
            multipleCasesList.add(new MultipleCases());
        }
    }

    /**
     * 5.私有化构造方法
     */
    private MultipleCases(){}

    /**
     * 6.定义方法随机获得序列号内的实例
     * @return
     */
    public static MultipleCases getInstance(){
        Random random = new Random();
        count = random.nextInt(maxNum);
        return multipleCasesList.get(count);
    }
}

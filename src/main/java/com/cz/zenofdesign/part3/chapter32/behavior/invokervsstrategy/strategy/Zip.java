package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.strategy;

/**
 * @ClassName: Zip
 * @date: 2019/7/15  15:40
 * @author: guohao
 * @Description:
 */
public class Zip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + " ZIP压缩成功");
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println(source + "-->" + to + " ZIP解压成功");
        return true;
    }
}

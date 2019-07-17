package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.strategy;

/**
 * @ClassName: Algorithm
 * @date: 2019/7/15  15:38
 * @author: guohao
 * @Description:
 */
public interface Algorithm {

    //压缩算法
    public boolean compress(String source,String to);

    //解压算法
    public boolean unCompress(String source,String to);
}

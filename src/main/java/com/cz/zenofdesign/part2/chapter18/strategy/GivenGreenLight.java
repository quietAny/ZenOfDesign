package com.cz.zenofdesign.part2.chapter18.strategy;

/**
 * @ClassName: GivenGreenLight
 * @date: 2019/7/11  17:12
 * @author: guohao
 * @Description:
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找吴国太开绿灯");
    }
}

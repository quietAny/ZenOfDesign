package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

import java.util.Random;

/**
 * @ClassName: Performance
 * @date: 2019/7/16  11:24
 * @author: guohao
 * @Description: 绩效
 */
public class Performance {

    //基本工资
    private BasicSalary basicSalary = new BasicSalary();

    /**
     * 绩效奖励
     */
    public int getPerformance(){
        int pref = (new Random()).nextInt(100);
        return basicSalary.getBasicSalary() * pref /100;
    }
}

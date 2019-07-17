package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: StrategyFactory
 * @date: 2019/7/16  16:06
 * @author: guohao
 * @Description: 策略工厂
 */
public class StrategyFactory {

    /**
     * 策略工厂
     */
    public static IDeduction getDeduction(StrategyMan strategy){
        IDeduction deduction = null;
        try {
            deduction = (IDeduction)Class.forName(strategy.getValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deduction;
    }
}

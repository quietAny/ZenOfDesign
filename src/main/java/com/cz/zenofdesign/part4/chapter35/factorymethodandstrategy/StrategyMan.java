package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: StrategyMan
 * @date: 2019/7/16  16:06
 * @author: guohao
 * @Description:
 */
public enum StrategyMan {

    SteadyDeduction("com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy.SteadyDeduction"),
    FreeDeduction("com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy.FreeDecution");
    String value = "";
    private StrategyMan(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


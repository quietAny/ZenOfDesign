package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: IDeduction
 * @date: 2019/7/16  15:53
 * @author: guohao
 * @Description: 扣款策略
 */
public interface IDeduction {
    //扣款，提供交易和卡信息，进行扣款，并返回是否扣款成功
    public boolean exec(Card card,Trade trade);
}

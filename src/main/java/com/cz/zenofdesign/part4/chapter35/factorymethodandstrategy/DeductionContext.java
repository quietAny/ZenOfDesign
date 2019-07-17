package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: DeductionContext
 * @date: 2019/7/16  16:03
 * @author: guohao
 * @Description: 扣款策略的封装
 */
public class DeductionContext {

    private IDeduction deduction = null;

    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }

    public boolean exec(Card card,Trade trade){
        return this.deduction.exec(card,trade);
    }

}

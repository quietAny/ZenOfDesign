package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: FreeDeduction
 * @date: 2019/7/16  16:01
 * @author: guohao
 * @Description: 扣款策略二
 */
public class FreeDeduction implements IDeduction{
    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}

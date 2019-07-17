package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: SteadyDeduction
 * @date: 2019/7/16  15:55
 * @author: guohao
 * @Description: 扣款策略一
 */
public class SteadyDeduction implements IDeduction{

    /**
     * 固定性扣款
     * @param card
     * @param trade
     * @return
     */
    @Override
    public boolean exec(Card card, Trade trade) {
        int halfMoney = (int)Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}

package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: DecuctionFacade
 * @date: 2019/7/16  16:17
 * @author: guohao
 * @Description: 扣款模块封装
 */
public class DecuctionFacade {

    /**
     * 对外公布扣款信息
     * @param card
     * @param trade
     * @return
     */
    public static Card deduct(Card card,Trade trade){
        //获得消费策略
        StrategyMan strategy = getDeductionType(trade);
        //初始化一个消费策略对象
        IDeduction deduction = StrategyFactory.getDeduction(strategy);
        //产生一个策略上下文
        DeductionContext context = new DeductionContext(deduction);
        //进行扣款处理
        context.exec(card,trade);
        return card;
    }

    /**
     * 获得对应的商户消费策略
     * @param trade
     * @return
     */
    private static StrategyMan getDeductionType(Trade trade) {
        if(trade.getTradeNo().contains("abc")){
            return StrategyMan.FreeDeduction;
        }else {
            return StrategyMan.SteadyDeduction;
        }
    }
}

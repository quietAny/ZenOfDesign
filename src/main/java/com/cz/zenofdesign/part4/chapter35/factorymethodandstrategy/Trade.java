package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: Trade
 * @date: 2019/7/16  15:46
 * @author: guohao
 * @Description: 交易信息
 */
public class Trade {
    //交易编码
    private String tradeNo = "";
    //交易金额
    private int amount  = 0;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

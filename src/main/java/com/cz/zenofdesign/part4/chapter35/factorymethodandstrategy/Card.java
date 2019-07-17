package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

/**
 * @ClassName: Card
 * @date: 2019/7/16  15:44
 * @author: guohao
 * @Description: IC卡
 */
public class Card {
    //卡号
    private String cardNo = "";
    //固定金额
    private int steadyMoney = 0;
    //自由金额
    private int freeMoney = 0;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}

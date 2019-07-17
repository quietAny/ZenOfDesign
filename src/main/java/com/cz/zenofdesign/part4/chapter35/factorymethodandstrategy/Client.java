package com.cz.zenofdesign.part4.chapter35.factorymethodandstrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Client
 * @date: 2019/7/16  16:24
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //初始化一张IC卡
        Card card = initIC();
        System.out.println("----初始化IC卡信息----");
        showCard(card);
        //是否停止运行状态
        boolean flag = true;
        while (flag){
            Trade trade = createTrade();
            DecuctionFacade.deduct(card,trade);
            //交易成功，打印出成功处理信息
            System.out.println("----交易凭证----");
            System.out.println(trade.getTradeNo() + " 交易成功！");
            System.out.println("本次交易金额为：" + trade.getAmount()/100.0 + "元");
            showCard(card);
            System.out.println("是否要退出?（Y/N）");
            if(getInput().equalsIgnoreCase("y")){
                flag = false;
            }
        }

    }

    /**
     * 初始化一个IC卡
     */
    private static Card initIC(){
        Card card = new Card();
        card.setCardNo("1100010001000");
        card.setFreeMoney(100000);
        card.setSteadyMoney(80000);
        return card;
    }

    /**
     * 产生一条交易
     */
    private static Trade createTrade(){
        Trade trade = new Trade();
        System.out.println("请输入交易编号:");
        trade.setTradeNo(getInput());
        System.out.println("请输入交易金额:");
        trade.setAmount(Integer.parseInt(getInput()));
        return trade;
    }

    /**
     * 展示IC卡信息
     * @param card
     */
    public static void showCard(Card card){
        System.out.println("IC卡编号：" + card.getCardNo());
        System.out.println("固定类型余额：" + card.getSteadyMoney()/100.0 + "元");
        System.out.println("自由类型余额：" + card.getFreeMoney()/100.0 + "元");
    }

    /**
     * 获得键盘输入
     * @return
     */
    private static String getInput() {
        String str = "";
        try {
            str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

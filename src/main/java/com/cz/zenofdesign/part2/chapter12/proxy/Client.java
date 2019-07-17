package com.cz.zenofdesign.part2.chapter12.proxy;

/**
 * @ClassName: Client
 * @date: 2019/7/10  14:28
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer("张三");

        IGamePlayer gameProxy = new GameProxy(gamePlayer);

        System.out.println("开始时间：" + System.currentTimeMillis());
        gameProxy.login("张三","password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        System.out.println("结束时间是：" + System.currentTimeMillis());
    }
}

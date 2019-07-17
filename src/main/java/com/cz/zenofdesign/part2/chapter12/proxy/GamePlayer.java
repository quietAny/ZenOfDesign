package com.cz.zenofdesign.part2.chapter12.proxy;

/**
 * @ClassName: GamePlayer
 * @date: 2019/7/10  14:22
 * @author: guohao
 * @Description: 玩家实现类
 */
public class GamePlayer implements IGamePlayer{

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 打boss
     */
    @Override
    public void killBoss() {
        System.out.println(this.name + "玩家打败了boss");
    }

    /**
     * 升级
     */
    @Override
    public void upgrade() {
        System.out.println(this.name + "玩家升了一级");
    }

    /**
     * 登录
     * @param user
     * @param password
     */
    @Override
    public void login(String user, String password) {
        System.out.println("登录名：" + user + "的用户" + this.name + "登录成功" );
    }
}

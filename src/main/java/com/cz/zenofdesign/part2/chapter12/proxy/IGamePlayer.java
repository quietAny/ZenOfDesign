package com.cz.zenofdesign.part2.chapter12.proxy;

/**
 * @ClassName: IGamePlayer
 * @date: 2019/7/10  14:21
 * @author: guohao
 * @Description: 游戏玩家接口
 */
public interface IGamePlayer {

    public void killBoss();

    public void upgrade();

    public void login(String user,String password);
}

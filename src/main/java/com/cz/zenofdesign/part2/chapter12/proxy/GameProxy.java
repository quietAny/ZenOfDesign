package com.cz.zenofdesign.part2.chapter12.proxy;

/**
 * @ClassName: GameProxy
 * @date: 2019/7/10  14:27
 * @author: guohao
 * @Description: 代练
 */
public class GameProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GameProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }
}

package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.proxy;

/**
 * @ClassName: Agent
 * @date: 2019/7/16  13:21
 * @author: guohao
 * @Description: 经纪人
 */
public class Agent implements IStar{

    private IStar star;

    public Agent(IStar star) {
        this.star = star;
    }

    @Override
    public void Sign() {
        star.Sign();
    }
}

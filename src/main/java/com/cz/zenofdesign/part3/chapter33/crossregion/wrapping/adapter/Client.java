package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.adapter;

import sun.net.InetAddressCachePolicy;

/**
 * @ClassName: Client
 * @date: 2019/7/16  13:53
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("演习模拟过程");
        IStar star = new FilmStar();
        star.act("前15分钟");
        IActor actor = new Actor();
        IStar standin = new Standin(actor);
        standin.act("中间5分钟");
        star.act("后15分钟");
    }
}

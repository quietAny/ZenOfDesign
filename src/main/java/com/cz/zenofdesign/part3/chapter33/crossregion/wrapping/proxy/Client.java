package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.proxy;

/**
 * @ClassName: Client
 * @date: 2019/7/16  13:35
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        IStar star = new Star();
        IStar agent = new Agent(star);
        agent.Sign();
    }
}

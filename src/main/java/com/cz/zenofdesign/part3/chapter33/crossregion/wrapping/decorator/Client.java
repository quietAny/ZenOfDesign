package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.decorator;

/**
 * @ClassName: Client
 * @date: 2019/7/16  13:43
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        IStar freakStar = new FreakStar();
        freakStar = new HotAir(freakStar);
        freakStar = new Deny(freakStar);
        System.out.println("----看一些明星的虚假形象----");
        freakStar.act();
    }
}

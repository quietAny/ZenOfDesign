package com.cz.zenofdesign.part2.chapter25.visitor.demo2;

/**
 * @ClassName: Client
 * @date: 2019/7/12  15:09
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KongFuRole();
        role.accept(actor);
    }
}

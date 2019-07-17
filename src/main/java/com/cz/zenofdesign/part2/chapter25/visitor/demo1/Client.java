package com.cz.zenofdesign.part2.chapter25.visitor.demo1;

/**
 * @ClassName: Client
 * @date: 2019/7/12  14:19
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Element el = ObjectStruture.createElement();
            el.accept(new Visitor());
        }
    }
}

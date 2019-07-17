package com.cz.zenofdesign.part2.chapter28.flyweight;

import java.util.stream.Stream;

/**
 * @ClassName: Client
 * @date: 2019/7/15  10:13
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 4; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}

package com.cz.zenofdesign.part2.chapter19.adapter;

/**
 * @ClassName: Client
 * @date: 2019/7/11  18:03
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        for (int i = 0; i < 101; i++) {
            userInfo.getMobileNumber();
        }
    }
}

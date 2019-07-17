package com.cz.zenofdesign.part1.chapter1;

/**
 * @ClassName: client
 * @date: 2019/7/9  14:54
 * @author: guohao
 * @Description: 单一职责原则
 */
public class client {

    public static void main(String[] args) {

        IUserInfo userInfo = new UserInfo();
        //我要赋值了
        IUserBO userBO = (IUserBO) userInfo;
        userBO.setPassword("abc");
        //我要执行动作了
        IUserBiz userBiz = (IUserBiz) userInfo;
        userBiz.deleteUser(userInfo);
    }
}

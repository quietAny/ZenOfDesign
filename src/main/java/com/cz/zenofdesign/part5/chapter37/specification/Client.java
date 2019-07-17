package com.cz.zenofdesign.part5.chapter37.specification;

import java.util.ArrayList;

/**
 * @ClassName: Client
 * @date: 2019/7/17  10:43
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //首先初始化一批用户
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("苏大",3));
        userList.add(new User("牛二",8));
        userList.add(new User("张三",10));
        userList.add(new User("李四",15));
        userList.add(new User("王五",18));
        userList.add(new User("赵六",20));
        userList.add(new User("马七",25));
        userList.add(new User("杨八",30));
        userList.add(new User("布十",40));
        //定义一个用户查询类
        IUserProvider userProvider = new UserProvider(userList);
        //打印出年龄大于20的用户
        System.out.println("----年龄大于20的用户，名字包含马七的人员----");
        //定义一个规格书
        IUserSpecification spec1 = new UserByAgeThan(20);
        IUserSpecification spec2 = new UserByNameEqual("马七");
        for (User u : userProvider.findUser(spec1.and(spec2))) {
            System.out.println(u);
        }
    }
}

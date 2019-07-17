package com.cz.zenofdesign.part2.chapter19.adapter;

/**
 * @ClassName: UserInfo
 * @date: 2019/7/11  17:47
 * @author: guohao
 * @Description:
 */
public class UserInfo implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println("这里是员工的姓名...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这里是员工的电话号...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这里是员工的办公室电话...");
        return null;
    }

    @Override
    public String getJobPositon() {
        System.out.println("这里是员工的职位...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这里是员工的家庭电话...");
        return null;
    }
}

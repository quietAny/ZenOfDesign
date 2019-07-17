package com.cz.zenofdesign.part2.chapter19.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: OuterUser
 * @date: 2019/7/11  17:50
 * @author: guohao
 * @Description:
 */
public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","这个员工叫。。。。");
        baseInfoMap.put("mobileNumber","这个员工电话是。。。。");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("officeTelNumber","这个员工办公室电话是。。。");
        officeInfo.put("jobPosition","这个员工的职位是。。。");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","这个员工家庭电话是。。。");
        homeInfo.put("homeAddress","这个员工的家庭地址是。。。");
        return homeInfo;
    }
}

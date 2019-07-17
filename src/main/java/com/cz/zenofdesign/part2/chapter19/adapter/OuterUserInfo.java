package com.cz.zenofdesign.part2.chapter19.adapter;

import org.omg.CORBA.BAD_CONTEXT;
import org.omg.CORBA.MARSHAL;

import java.util.Map;

/**
 * @ClassName: OuterUserInfo
 * @date: 2019/7/11  17:55
 * @author: guohao
 * @Description:
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();
    private Map officeInfo = super.getUserOfficeInfo();
    private Map homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        String userName = (String) baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String)homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPositon() {
        String jobPositon = (String)officeInfo.get("jobPosion");
        System.out.println(jobPositon);
        return jobPositon;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}

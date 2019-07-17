package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

import java.util.Date;

/**
 * @ClassName: Client
 * @date: 2019/7/16  13:09
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //定义门面
        HRFacade hrFacade = new HRFacade();
        System.out.println("----外系统查询总收入----");
        int salary = hrFacade.querySalary("张三",new Date(System.currentTimeMillis()));
        System.out.println("张三 11月收入：" + salary);
        System.out.println("\n----外系统查询考勤-----");
        int workdays = hrFacade.queryWorkdays("张三");
        System.out.println("张三 11月考勤：" + workdays + "天");
    }
}

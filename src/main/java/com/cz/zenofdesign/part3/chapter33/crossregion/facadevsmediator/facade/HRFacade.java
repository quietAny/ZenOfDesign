package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

import java.util.Date;

/**
 * @ClassName: HRFacade
 * @date: 2019/7/16  13:05
 * @author: guohao
 * @Description: hr门面
 */
public class HRFacade {

    //员工总收入
    private SalaryProvider salaryProvider = new SalaryProvider();
    //考勤情况
    private Attendance attendance = new Attendance();

    /**
     * 查询一个人收入
     * @param name
     * @param date
     * @return
     */
    public int querySalary(String name, Date date){
        return salaryProvider.totalSalary();
    }

    /**
     * 查询一个人考勤
     * @param name
     * @return
     */
    public int queryWorkdays(String name){
        return attendance.getWorkDays();
    }
}

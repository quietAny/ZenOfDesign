package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

/**
 * @ClassName: Bouns
 * @date: 2019/7/16  11:19
 * @author: guohao
 * @Description: 奖金
 */
public class Bouns {

    //考勤情况
    private Attendance attendance = new Attendance();

    /**
     * 通过考勤获得奖金
     * @return
     */
    public int getBouns(){
        int workDays = attendance.getWorkDays();
        int bouns = workDays * 1800 / 30;
        return bouns;
    }
}

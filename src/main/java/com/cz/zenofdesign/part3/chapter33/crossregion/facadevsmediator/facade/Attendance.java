package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

import java.util.Random;

/**
 * @ClassName: Attendance
 * @date: 2019/7/16  11:18
 * @author: guohao
 * @Description: 考勤
 */
public class Attendance {

    public int getWorkDays(){
        return (new Random()).nextInt(30);
    }
}

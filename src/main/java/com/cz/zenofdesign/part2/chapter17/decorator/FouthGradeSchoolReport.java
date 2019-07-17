package com.cz.zenofdesign.part2.chapter17.decorator;

/**
 * @ClassName: FouthGradeSchoolReport
 * @date: 2019/7/11  16:45
 * @author: guohao
 * @Description:
 */
public class FouthGradeSchoolReport extends SchoolReport{
    @Override
    public void report() {
        System.out.println("尊重的XXX家长");
        System.out.println("..........");
        System.out.println(" 语文：62  数学：65 体育：98 自然：63");
        System.out.println("..........");
        System.out.println("          家长签名：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}

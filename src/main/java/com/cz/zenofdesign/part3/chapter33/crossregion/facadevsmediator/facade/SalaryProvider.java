package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

/**
 * @ClassName: SalaryProvider
 * @date: 2019/7/16  11:28
 * @author: guohao
 * @Description: 总工资计算
 */
public class SalaryProvider {

    //基本工资
    private BasicSalary basicSalary = new BasicSalary();
    //奖金
    private Bouns bouns = new Bouns();
    //绩效
    private Performance performance = new Performance();
    //税收
    private Tax tax = new Tax();

    /**
     * 获得总收入
     */
    public int totalSalary(){
        return this.basicSalary.getBasicSalary() + bouns.getBouns() + performance.getPerformance() + tax.getTax();
    }



}

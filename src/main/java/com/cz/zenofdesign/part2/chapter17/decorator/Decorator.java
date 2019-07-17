package com.cz.zenofdesign.part2.chapter17.decorator;

/**
 * @ClassName: Decorator
 * @date: 2019/7/11  16:42
 * @author: guohao
 * @Description:
 */
public class Decorator extends SchoolReport{

    private SchoolReport schoolReport;
    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}

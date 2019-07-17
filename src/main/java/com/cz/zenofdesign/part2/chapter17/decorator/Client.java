package com.cz.zenofdesign.part2.chapter17.decorator;

/**
 * @ClassName: Client
 * @date: 2019/7/11  16:54
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        SchoolReport report;
        report = new FouthGradeSchoolReport();
        report = new HighScoreDecorator(report);
        report = new SortDecorator(report);

        report.report();
        report.sign("老爸");
    }

}

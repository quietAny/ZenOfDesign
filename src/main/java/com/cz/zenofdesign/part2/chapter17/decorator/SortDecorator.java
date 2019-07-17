package com.cz.zenofdesign.part2.chapter17.decorator;

/**
 * @ClassName: SortDecorator
 * @date: 2019/7/11  16:52
 * @author: guohao
 * @Description:
 */
public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    public void reportSort(){
        System.out.println("我的排名是36名");
    }


    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}

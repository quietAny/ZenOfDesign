package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.mediator;

import com.cz.zenofdesign.part2.chapter18.strategy.IStrategy;

/**
 * @ClassName: Salary
 * @date: 2019/7/16  10:59
 * @author: guohao
 * @Description:
 */
public class Salary extends AbsColleague implements ISalary {

    public Salary(AbsMadiator madiator) {
        super(madiator);
    }

    @Override
    public void increaseSalary() {
        super.madiator.up(this);
    }

    @Override
    public void decreaseSalary() {
        super.madiator.down(this);
    }
}

package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.mediator;

/**
 * @ClassName: Tax
 * @date: 2019/7/16  11:00
 * @author: guohao
 * @Description:
 */
public class Tax extends AbsColleague implements ITax {

    public Tax(AbsMadiator madiator) {
        super(madiator);
    }

    @Override
    public void raise() {
        super.madiator.up(this);
    }

    @Override
    public void drop() {
        super.madiator.down(this);
    }
}

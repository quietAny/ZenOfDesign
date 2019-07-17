package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.mediator;

/**
 * @ClassName: Positon
 * @date: 2019/7/16  10:48
 * @author: guohao
 * @Description:
 */
public class Positon extends AbsColleague implements IPosition {

    public Positon(AbsMadiator madiator) {
        super(madiator);
    }

    @Override
    public void promote() {
        super.madiator.up(this);
    }

    @Override
    public void demote() {
        super.madiator.down(this);
    }
}

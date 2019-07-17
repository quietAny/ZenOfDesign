package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.bridge;

/**
 * @ClassName: AbsStar
 * @date: 2019/7/16  14:02
 * @author: guohao
 * @Description:
 */
public abstract class AbsStar {

    protected final AbsAction absAction;

    public AbsStar(AbsAction absAction) {
        this.absAction = absAction;
    }

    public void doJob(){
       this.absAction.desc();
    }
}

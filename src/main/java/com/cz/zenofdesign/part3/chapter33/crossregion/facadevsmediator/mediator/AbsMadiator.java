package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.mediator;


/**
 * @ClassName: AbsMadiator
 * @date: 2019/7/16  10:46
 * @author: guohao
 * @Description: 抽象中介者
 */
public abstract class AbsMadiator {

    protected final ISalary salary;
    protected final IPosition position;
    protected final ITax tax;

    public AbsMadiator() {
        this.salary = new Salary(this);
        this.position = new Positon(this);
        this.tax = new Tax(this);
    }

    public abstract void up(ISalary salary);
    public abstract void up(IPosition position);
    public abstract void up(ITax tax);

    public abstract void down(ISalary salary);
    public abstract void down(IPosition position);
    public abstract void down(ITax tax);


}

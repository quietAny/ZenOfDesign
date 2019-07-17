package com.cz.zenofdesign.part2.chapter10.templatemethod;

/**
 * @ClassName: AbstractClass
 * @date: 2019/7/10  10:41
 * @author: guohao
 * @Description: 模板抽象类
 */
public abstract class AbstractClass {

    protected abstract void doAnything();

    protected abstract void doSomething();

    public void templateMethod(){
        this.doAnything();
        this.doSomething();
    }
}

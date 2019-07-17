package com.cz.zenofdesign.part2.chapter23.facade;

/**
 * @ClassName: Context
 * @date: 2019/7/12  13:17
 * @author: guohao
 * @Description:
 */
public class Context {

    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void complexMethod(){
        this.classB.doSomethingB();
        this.classC.doSomethingC();
    }
}

package com.cz.zenofdesign.part2.chapter23.facade;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName: Facade
 * @date: 2019/7/12  13:10
 * @author: guohao
 * @Description:
 */
public class Facade {

    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    private Context context = new Context();

    public void methodA(){
        this.classA.doSomethingA();
    }

    public void methodB(){
        this.classB.doSomethingB();
    }

    public void methodC(){
        this.classC.doSomethingC();
    }

    public void compleMethod(){
        context.complexMethod();
    }
}

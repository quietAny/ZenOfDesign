package com.cz.zenofdesign.part2.chapter21.composite.demo1;

/**
 * @ClassName: Component
 * @date: 2019/7/12  9:43
 * @author: guohao
 * @Description: 抽象组件
 */
public abstract class Component {

    /**
     * 个体整体都共享
     */
    public void doSomething(){
        System.out.println("处理业务逻辑");
    }

}

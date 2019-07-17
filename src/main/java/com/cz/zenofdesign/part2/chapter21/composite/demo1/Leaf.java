package com.cz.zenofdesign.part2.chapter21.composite.demo1;

/**
 * @ClassName: Leaf
 * @date: 2019/7/12  9:46
 * @author: guohao
 * @Description: 树叶组件
 */
public class Leaf extends Component {

    @Override
    public void doSomething() {
        System.out.println("处理树叶业务逻辑");
    }
}

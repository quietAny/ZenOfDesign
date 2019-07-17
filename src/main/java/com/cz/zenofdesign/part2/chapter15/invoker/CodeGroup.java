package com.cz.zenofdesign.part2.chapter15.invoker;

/**
 * @ClassName: CodeGroup
 * @date: 2019/7/11  15:03
 * @author: guohao
 * @Description: 后端组
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划");
    }
}

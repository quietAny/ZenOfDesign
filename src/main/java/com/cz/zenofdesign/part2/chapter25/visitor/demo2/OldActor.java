package com.cz.zenofdesign.part2.chapter25.visitor.demo2;

/**
 * @ClassName: OldActor
 * @date: 2019/7/12  15:08
 * @author: guohao
 * @Description:
 */
public class OldActor extends AbsActor{

    @Override
    public void act(KongFuRole kongFuRole) {
        System.out.println("年龄大了，不能饰演功夫角色");
    }
}

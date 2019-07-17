package com.cz.zenofdesign.part2.chapter25.visitor.demo2;

/**
 * @ClassName: KongFuRole
 * @date: 2019/7/12  15:03
 * @author: guohao
 * @Description:
 */
public class KongFuRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}

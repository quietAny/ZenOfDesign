package com.cz.zenofdesign.part2.chapter25.visitor.demo2;

/**
 * @ClassName: IdiotRole
 * @date: 2019/7/12  15:03
 * @author: guohao
 * @Description:
 */
public class IdiotRole implements Role {
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}

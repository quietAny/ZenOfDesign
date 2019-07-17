package com.cz.zenofdesign.part2.chapter25.visitor.demo2;

/**
 * @ClassName: YoungActor
 * @date: 2019/7/12  15:07
 * @author: guohao
 * @Description:
 */
public class YoungActor extends AbsActor {

    @Override
    public void act(Role role) {
        System.out.println("最喜欢扮演功夫角色");
    }
}

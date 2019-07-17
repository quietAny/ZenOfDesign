package com.cz.zenofdesign.part2.chapter25.visitor.demo2;

/**
 * @ClassName: AbsActor
 * @date: 2019/7/12  15:04
 * @author: guohao
 * @Description:
 */
public abstract class AbsActor {

    public void act(Role role){
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KongFuRole kongFuRole){
        System.out.println("演员可以扮演功夫角色");
    }
}

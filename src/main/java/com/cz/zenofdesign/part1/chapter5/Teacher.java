package com.cz.zenofdesign.part1.chapter5;

/**
 * @ClassName: Teacher
 * @date: 2019/7/9  16:54
 * @author: guohao
 * @Description: 老师类
 */
public class Teacher {

    /**
     * 告诉体育委员去统计
     * @param leader
     */
    public void command(GroupLeader leader){
        leader.countGirls();
    }
}

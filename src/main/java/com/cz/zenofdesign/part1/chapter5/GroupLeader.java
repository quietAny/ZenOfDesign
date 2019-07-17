package com.cz.zenofdesign.part1.chapter5;

import java.util.List;

/**
 * @ClassName: GroupLeader
 * @date: 2019/7/9  16:56
 * @author: guohao
 * @Description: 体育委员类
 */
public class GroupLeader {

    private List<Girl> girls;

    public GroupLeader(List<Girl> girls) {
        this.girls = girls;
    }

    /**
     * 统计女生
     */
    public void countGirls(){
        System.out.println("女生的数量是：" + girls.size());
    }
}

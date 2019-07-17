package com.cz.zenofdesign.part2.chapter21.composite.demo2;

import java.util.ArrayList;

/**
 * @ClassName: Branch
 * @date: 2019/7/12  10:17
 * @author: guohao
 * @Description: 查找父节点，可实现向上遍历
 */
public class Branch extends Corp {

    //领导下的下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    /**
     * 增加一个下属，有可能是小头目，也有可能是小兵
     * @param corp
     */
    public void addSubordinate(Corp corp){
        //设置父节点
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    /**
     * 获得所有下级节点
     * @return
     */
    public ArrayList<Corp> getSubordinate(){
        return this.subordinateList;
    }

    /**
     * 查找父节点
     * @param corp
     * @return
     */
    public Corp find(Corp corp){
        return corp.getParent();
    }
}

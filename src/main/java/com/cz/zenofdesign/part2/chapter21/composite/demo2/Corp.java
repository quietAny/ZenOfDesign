package com.cz.zenofdesign.part2.chapter21.composite.demo2;

import com.cz.zenofdesign.part2.chapter8.factorymethod.ConcreteProduct1;

/**
 * @ClassName: Corp
 * @date: 2019/7/12  10:11
 * @author: guohao
 * @Description:
 */
public abstract class Corp {

    //姓名
    private String name = "";
    //职位
    private String position = "";
    //薪资
    private int salary = 0;
    //父节点
    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
     * 获得员工信息
     * @return
     */
    public String getInfo(){
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }
}

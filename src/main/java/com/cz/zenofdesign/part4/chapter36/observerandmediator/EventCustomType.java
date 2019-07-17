package com.cz.zenofdesign.part4.chapter36.observerandmediator;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName: EventCustomType
 * @date: 2019/7/17  9:16
 * @author: guohao
 * @Description: 事件处理枚举
 */
public enum  EventCustomType {
    //新建立事件
    NEW(1),
    //删除事件
    DEL(2),
    //修改事件
    EDIT(3),
    //克隆事件
    CLONE(4);

    private int value = 0;

    private EventCustomType(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

}

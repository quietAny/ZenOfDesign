package com.cz.zenofdesign.part2.chapter24.memento;

/**
 * @ClassName: Memento
 * @date: 2019/7/12  13:26
 * @author: guohao
 * @Description: 备忘录
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

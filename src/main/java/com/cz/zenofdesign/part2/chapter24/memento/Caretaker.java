package com.cz.zenofdesign.part2.chapter24.memento;

/**
 * @ClassName: Caretaker
 * @date: 2019/7/12  13:34
 * @author: guohao
 * @Description: 备忘录管理者
 */
public class Caretaker {

    private Memento memento;



    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

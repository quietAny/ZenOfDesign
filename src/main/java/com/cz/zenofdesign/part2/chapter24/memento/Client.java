package com.cz.zenofdesign.part2.chapter24.memento;

/**
 * @ClassName: Client
 * @date: 2019/7/12  13:29
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很好");
        System.out.println("男孩现在的心情：" + boy.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println("追女孩后的心情：" + boy.getState());
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("男孩恢复后的心情：" + boy.getState());
    }
}

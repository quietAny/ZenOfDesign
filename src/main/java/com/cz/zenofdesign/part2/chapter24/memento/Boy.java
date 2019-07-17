package com.cz.zenofdesign.part2.chapter24.memento;

/**
 * @ClassName: Boy
 * @date: 2019/7/12  13:24
 * @author: guohao
 * @Description:
 */
public class Boy {

    private String state;

    public void changeState(){
        this.state = "心情不好";
    }

    /**
     * 保存备份
     * @return
     */
    public Memento createMemento(){
        return new Memento(this.state);
    }

    /**
     * 恢复备份
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

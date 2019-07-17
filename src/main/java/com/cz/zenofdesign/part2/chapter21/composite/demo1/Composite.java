package com.cz.zenofdesign.part2.chapter21.composite.demo1;

import java.util.ArrayList;

/**
 * @ClassName: Composite
 * @date: 2019/7/12  9:44
 * @author: guohao
 * @Description: 数值组件
 */
public class Composite extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component){
        componentArrayList.add(component);
    }

    public void remove(Component component){
        componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}

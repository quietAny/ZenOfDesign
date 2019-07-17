package com.cz.zenofdesign.part4.chapter36.observerandmediator;

import sun.awt.PaintEventDispatcher;

import java.util.Observable;

/**
 * @ClassName: ProductEvent
 * @date: 2019/7/16  17:21
 * @author: guohao
 * @Description: 产品事件
 */
public class ProductEvent extends Observable {

    //事件起源
    private Product source;
    //事件类型
    private ProductEventType type;

    /**
     * 传入事件的源头，默认为新建类型
     * @param p
     */
    public ProductEvent(Product p){
        this(p,ProductEventType.NEW_PRODUCT);
    }

    /**
     * 事件源头以及事件类型
     * @param source
     * @param type
     */
    public ProductEvent(Product source, ProductEventType type) {
        this.source = source;
        this.type = type;
        notifyEventDispatch();
    }

    /**
     * 通知事件处理中心
     */
    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);

    }

    /**
     * 获得事件的始作俑者
     */
    public Product getSource(){
        return source;
    }

    /**
     * 获得事件类型
     * @return
     */
    public ProductEventType getType() {
        return type;
    }
}

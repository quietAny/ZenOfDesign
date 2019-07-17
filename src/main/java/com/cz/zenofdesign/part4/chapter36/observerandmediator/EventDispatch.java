package com.cz.zenofdesign.part4.chapter36.observerandmediator;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * @ClassName: EventDispatch
 * @date: 2019/7/16  17:32
 * @author: guohao
 * @Description:
 */
public class EventDispatch implements Observer{

    //单例模式
    private final static EventDispatch dispatch = new EventDispatch();
    //事件消费者
    private Vector<EventCustomer> customers = new Vector<EventCustomer>();

    private EventDispatch(){}

    public static EventDispatch getEventDispatch() {
        return dispatch;
    }

    /**
     * 事件触发
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        //事件源头
        Product product = (Product)arg;
        //事件
        ProductEvent event = (ProductEvent)o;
        //处理者处理，这是是中介者模式的核心，可以是很复杂的业务逻辑
        for (EventCustomer e: customers) {
            for (EventCustomType t: e.getCustomerTypes()){
                if(t.getValue() == event.getType().getValue()){
                    e.exec(event);
                }
            }
        }
    }

    /**
     * 注册事件处理者
     */
    public void registerCustomer(EventCustomer customer){
        customers.add(customer);
    }
}

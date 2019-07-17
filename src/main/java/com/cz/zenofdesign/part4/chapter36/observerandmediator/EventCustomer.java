package com.cz.zenofdesign.part4.chapter36.observerandmediator;

import java.util.Vector;

/**
 * @ClassName: EventCustomer
 * @date: 2019/7/16  17:54
 * @author: guohao
 * @Description:
 */
public abstract class EventCustomer {

    //容纳每个消费者能够处理的级别
    private Vector<EventCustomType> customerTypes = new Vector<EventCustomType>();

    /**
     * 每个消费者都要声明自己处理哪一类的事件
     * @param customerType
     */
    public EventCustomer(EventCustomType customerType){
        addCustomType(customerType);
    }

    /**
     * 每个消费者可以消费多个事件
     * @param customerType
     */
    public void addCustomType(EventCustomType customerType){
        customerTypes.add(customerType);
    }

    /**
     * 得到自己的处理能力
     */
    public Vector<EventCustomType> getCustomerTypes(){
        return customerTypes;
    }

    //每个事件都要对事件进行声明式消费
    public abstract void exec(ProductEvent event);


}

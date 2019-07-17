package com.cz.zenofdesign.part4.chapter36.observerandmediator;

/**
 * @ClassName: Beggar
 * @date: 2019/7/17  9:21
 * @author: guohao
 * @Description: 乞丐
 */
public class Beggar extends EventCustomer{

    public Beggar() {
        super(EventCustomType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product p = event.getSource();
        //事件类型
        ProductEventType type = event.getType();
        System.out.println("乞丐处理事件：" + p.getName() + "销毁，事件类型：" + type);
    }
}

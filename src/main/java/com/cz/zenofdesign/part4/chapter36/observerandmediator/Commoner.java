package com.cz.zenofdesign.part4.chapter36.observerandmediator;

/**
 * @ClassName: Commoner
 * @date: 2019/7/17  9:37
 * @author: guohao
 * @Description:
 */
public class Commoner extends EventCustomer {

    public Commoner() {
        super(EventCustomType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product p = event.getSource();
        //事件的类型
        ProductEventType type = event.getType();
        System.out.println("平民处理事件：" + p.getName() + "诞生记，事件类型：" + type);
    }
}

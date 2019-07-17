package com.cz.zenofdesign.part4.chapter36.observerandmediator;

/**
 * @ClassName: Nobleman
 * @date: 2019/7/17  9:28
 * @author: guohao
 * @Description:
 */
public class Nobleman extends EventCustomer{

    public Nobleman(){
        super(EventCustomType.EDIT);
        super.addCustomType(EventCustomType.CLONE);
    }


    @Override
    public void exec(ProductEvent event) {
        //事件的源头
        Product p = event.getSource();
        //事件的类型
        ProductEventType type = event.getType();
        if(type.getValue() == EventCustomType.CLONE.getValue()){
            System.out.println("贵族处理事件：" + p.getName() + "克隆，事件类型：" + type);
        }else {
            System.out.println("贵族处理时间：" + p.getName() + "修改，事件类型：" + type);
        }
    }
}

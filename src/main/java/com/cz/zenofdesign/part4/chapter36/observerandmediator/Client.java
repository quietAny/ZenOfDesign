package com.cz.zenofdesign.part4.chapter36.observerandmediator;

/**
 * @ClassName: Client
 * @date: 2019/7/17  9:35
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        //获得事件分发中心
        EventDispatch dispatch = EventDispatch.getEventDispatch();
        //接收乞丐的事件处理
        dispatch.registerCustomer(new Beggar());
        //接收平民的事件处理
        dispatch.registerCustomer(new Commoner());
        //接收贵族的事件处理
        dispatch.registerCustomer(new Nobleman());
        //建立一个原子弹生产工厂
        ProductManager factory = new ProductManager();
        //制造一个产品
        System.out.println("----模拟创建产品事件----");
        System.out.println("创建一个叫小男孩的原子弹");
        Product p = factory.createProduct("小男孩原子弹");
        //修改一个产品
        System.out.println("\n----模拟修改产品事件----");
        System.out.println("把小男孩原子弹改为胖子号原子弹");
        factory.editProduct(p,"胖子号原子弹");
        //在克隆一个原子弹
        System.out.println("\n----模拟克隆产品事件----");
        System.out.println("克隆胖子号原子弹");
        factory.clone(p);
        //遗弃一个产品
        System.out.println("\n----模拟销毁产品事件-----");
        System.out.println("遗弃胖子号原子弹");
        factory.abandonProduct(p);
    }
}

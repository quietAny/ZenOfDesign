package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.decorator;

/**
 * @ClassName: UglyDuckling
 * @date: 2019/7/15  14:49
 * @author: guohao
 * @Description: 丑小鸭
 */
public class UglyDuckling implements Swan{
    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }

    @Override
    public void cry() {
        System.out.println("叫声是克噜-克噜");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
    }
}

package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.adpapter;

/**
 * @ClassName: Duckling
 * @date: 2019/7/15  15:05
 * @author: guohao
 * @Description:
 */
public class Duckling implements Duck{
    @Override
    public void cry() {
        System.out.println("叫声是<{=．．．．(嘎~嘎~嘎~)");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是黄白相间，最长");
    }

    @Override
    public void desBehavior() {
        System.out.println("会游泳");
    }
}

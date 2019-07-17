package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.adapter;

/**
 * @ClassName: Actor
 * @date: 2019/7/16  13:50
 * @author: guohao
 * @Description:
 */
public class Actor implements IActor {
    @Override
    public void playact(String context) {
        System.out.println("普通演员演戏：" + context);
    }
}

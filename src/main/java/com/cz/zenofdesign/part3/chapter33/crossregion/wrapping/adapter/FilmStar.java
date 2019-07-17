package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.adapter;

/**
 * @ClassName: FilmStar
 * @date: 2019/7/16  13:48
 * @author: guohao
 * @Description: 电影明星
 */
public class FilmStar implements IStar{
    @Override
    public void act(String context) {
        System.out.println("明星演戏:" + context);
    }
}

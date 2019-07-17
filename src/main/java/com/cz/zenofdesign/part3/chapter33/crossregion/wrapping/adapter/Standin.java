package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.adapter;

/**
 * @ClassName: Standin
 * @date: 2019/7/16  13:49
 * @author: guohao
 * @Description:
 */
public class Standin implements IStar {

    private IActor actor;

    public Standin(IActor actor) {
        this.actor = actor;
    }

    @Override
    public void act(String context) {
        actor.playact(context);
    }
}

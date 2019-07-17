package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.builder;

/**
 * @ClassName: Builder
 * @date: 2019/7/15  11:08
 * @author: guohao
 * @Description:
 */
public abstract class Builder {

    protected final SuperMan superMan = new SuperMan();

    public void setBody(String body){
        this.superMan.setBody(body);
    }

    public void setSpecialTalent(String talent){
        this.superMan.setSpecialTalent(talent);
    }

    public void setSpeicalSymbol(String symbol){
        this.superMan.setSpecialSymbol(symbol);
    }

    public abstract SuperMan getSuperMan();
}

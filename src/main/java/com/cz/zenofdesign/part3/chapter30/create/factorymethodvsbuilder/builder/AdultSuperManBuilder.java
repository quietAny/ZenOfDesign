package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.builder;

/**
 * @ClassName: AdultSuperManBuilder
 * @date: 2019/7/15  11:12
 * @author: guohao
 * @Description:
 */
public class AdultSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的身体");
        super.setSpecialTalent("会飞行");
        super.setSpeicalSymbol("胸前带s标记");
        return super.superMan;
    }
}

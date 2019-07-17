package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.builder;

/**
 * @ClassName: ChildSuperManBuilder
 * @date: 2019/7/15  11:14
 * @author: guohao
 * @Description:
 */
public class ChildSuperManBuilder extends Builder{

    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的身体");
        super.setSpecialTalent("刀枪不入");
        super.setSpeicalSymbol("胸前带小s标记");
        return super.superMan;
    }
}

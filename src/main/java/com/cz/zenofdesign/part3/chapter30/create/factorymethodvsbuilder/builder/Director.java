package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.builder;

/**
 * @ClassName: Director
 * @date: 2019/7/15  11:16
 * @author: guohao
 * @Description:
 */
public class Director {

    private static Builder adultBuilder = new AdultSuperManBuilder();
    private static Builder chilBuilder = new ChildSuperManBuilder();

    public static SuperMan getAdultSuperMan(){
        return adultBuilder.getSuperMan();
    }

    public static SuperMan getChilSuperMan(){
        return chilBuilder.getSuperMan();
    }
}

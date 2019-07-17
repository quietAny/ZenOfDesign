package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.factorymethod;

/**
 * @ClassName: SupManFactory
 * @date: 2019/7/15  11:03
 * @author: guohao
 * @Description:
 */
public class SupManFactory {

    public static ISuperMan createSuperMan(String type){
        if (type.equalsIgnoreCase("adult")){
            return new AdultSuperMan();
        }else if (type.equalsIgnoreCase("child")){
            return new ChildSuperMan();
        }else {
            return null;
        }
    }
}

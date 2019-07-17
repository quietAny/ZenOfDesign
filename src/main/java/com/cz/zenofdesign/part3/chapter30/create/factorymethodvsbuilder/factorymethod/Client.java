package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.factorymethod;

/**
 * @ClassName: Client
 * @date: 2019/7/15  11:05
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ISuperMan iSuperMan = SupManFactory.createSuperMan("child");
        iSuperMan.sepecialTalent();
    }
}

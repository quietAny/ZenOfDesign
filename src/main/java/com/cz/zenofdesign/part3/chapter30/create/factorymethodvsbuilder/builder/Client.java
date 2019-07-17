package com.cz.zenofdesign.part3.chapter30.create.factorymethodvsbuilder.builder;

/**
 * @ClassName: Client
 * @date: 2019/7/15  11:18
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        SuperMan superMan = Director.getAdultSuperMan();
        System.out.println(superMan.getSpecialTalent());

    }
}

package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.mediator;

/**
 * @ClassName: Client
 * @date: 2019/7/16  11:11
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IPosition position = new Positon(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);

        System.out.println("----职位提升----");
        position.promote();
    }
}

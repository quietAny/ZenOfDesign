package com.cz.zenofdesign.part2.chapter14.mediator;

/**
 * @ClassName: Client
 * @date: 2019/7/11  14:34
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        AbstractMediator mediator = new Mediator();
        System.out.println("-----采购人员采购电脑-----");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        System.out.println("-----销售人员销售电脑-----");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("-----库房人员清理电脑-----");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}

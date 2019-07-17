package com.cz.zenofdesign.part2.chapter14.mediator;

import java.util.Random;

/**
 * @ClassName: Sale
 * @date: 2019/7/11  14:11
 * @author: guohao
 * @Description: 销售
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 销售电脑
     * @param number
     */
    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("销售电脑：" + number + "台");
    }

    /**
     * 反馈销售情况
     * @return
     */
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    /**
     * 折价处理
     */
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }

}

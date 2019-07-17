package com.cz.zenofdesign.part2.chapter14.mediator;

/**
 * @ClassName: Stock
 * @date: 2019/7/11  14:11
 * @author: guohao
 * @Description: 库管
 */
public class Stock extends AbstractColleague{

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    //初始库存
    private static int COMPUTER_NUMBER = 100;

    /**
     * 增加库存
     * @param number
     */
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为:" + COMPUTER_NUMBER);
    }

    /**
     * 减少库存
     * @param number
     */
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    /**
     * 获得库存
     * @return
     */
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        System.out.println("清理库存货数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}

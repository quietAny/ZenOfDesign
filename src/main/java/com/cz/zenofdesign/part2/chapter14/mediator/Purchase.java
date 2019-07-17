package com.cz.zenofdesign.part2.chapter14.mediator;

/**
 * @ClassName: Purchase
 * @date: 2019/7/11  14:11
 * @author: guohao
 * @Description: 采购员
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 采购IMB电脑
     */
    public void buyIBMComputer(int number){
        super.mediator.execute("purchase.buy",number);
    }

    /**
     * 不再采购IBM电脑
     */
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}

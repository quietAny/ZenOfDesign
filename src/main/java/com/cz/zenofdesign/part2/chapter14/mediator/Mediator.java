package com.cz.zenofdesign.part2.chapter14.mediator;

/**
 * @ClassName: Mediator
 * @date: 2019/7/11  14:14
 * @author: guohao
 * @Description:
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        } else if (str.equals("sale.sell")){
            this.sellComputer((Integer)objects[0]);
        } else if (str.equals("sale.offsell")){
            this.offSell();
        } else if (str.equals("stock.clear")){
            this.clearStock();
        }
    }

    /**
     * 采购电脑
     * @param number
     */
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus > 80){
            System.out.println("采购IBM电脑："+ number + "台");
            super.stock.increase(number);
        }else{
            int buyNumber = number/2;
            System.out.println("采购IBM电脑："+ buyNumber + "台");
        }
    }

    /**
     * 销售电脑
     * @param number
     */
    private void sellComputer(int number){
        if(super.stock.getStockNumber() < number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.increase(number);
    }

    /**
     * 半价销售
     */
    private void offSell(){
        System.out.println("半价销售IBM电脑"+ stock.getStockNumber() + "台");
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}

package com.cz.zenofdesign.part2.chapter29.bridge;

/**
 * @ClassName: Corp
 * @date: 2019/7/15  10:33
 * @author: guohao
 * @Description: 公司
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }


}

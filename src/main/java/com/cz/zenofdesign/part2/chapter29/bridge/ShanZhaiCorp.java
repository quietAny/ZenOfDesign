package com.cz.zenofdesign.part2.chapter29.bridge;

/**
 * @ClassName: ShanZhaiCorp
 * @date: 2019/7/15  10:42
 * @author: guohao
 * @Description:
 */
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱了。。。。");
    }
}

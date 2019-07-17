package com.cz.zenofdesign.part2.chapter29.bridge;

/**
 * @ClassName: HouseCorp
 * @date: 2019/7/15  10:41
 * @author: guohao
 * @Description: 房地产公司
 */
public class HouseCorp extends Corp{

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了。。。。");
    }
}

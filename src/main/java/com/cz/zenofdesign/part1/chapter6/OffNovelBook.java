package com.cz.zenofdesign.part1.chapter6;

/**
 * @ClassName: OffNovelBook
 * @date: 2019/7/9  17:26
 * @author: guohao
 * @Description: 打折书籍
 */
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, String author, int price) {
        super(name, author, price);
    }

    /**
     * 重写销售价格
     * @return
     */
    @Override
    public int getPrice() {
        int selfprice = super.getPrice();
        int offPrice = 0;
        if(selfprice > 4000){
            offPrice = selfprice * 90 / 100;
        }else {
            offPrice = selfprice * 80 / 100;
        }
        return offPrice;

    }
}

package com.cz.zenofdesign.part1.chapter4;

/**
 * @ClassName: Searcher
 * @date: 2019/7/9  16:34
 * @author: guohao
 * @Description:
 */
public class Searcher extends AbstractSearcher {


    public Searcher(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        pettyGirl.goodLooking();
        pettyGirl.greatTemperament();
        pettyGirl.niceFigure();
    }
}

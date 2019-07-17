package com.cz.zenofdesign.part1.chapter4;

/**
 * @ClassName: Client
 * @date: 2019/7/9  16:34
 * @author: guohao
 * @Description: 接口隔离原则
 */
public class Client {

    public static void main(String[] args) {
        IPettyGirl pettyGirl = new PettyGirl("嫣嫣");
        AbstractSearcher searcher = new Searcher(pettyGirl);
        searcher.show();

    }
}

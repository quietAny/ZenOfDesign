package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: Client
 * @date: 2019/7/12  15:51
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

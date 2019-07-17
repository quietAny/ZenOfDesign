package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: OpenningState
 * @date: 2019/7/12  15:30
 * @author: guohao
 * @Description: 敞开状态
 */
public class OpenningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}

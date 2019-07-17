package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: ClosingState
 * @date: 2019/7/12  15:34
 * @author: guohao
 * @Description: 关闭状态
 */
public class ClosingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.openningstate);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
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

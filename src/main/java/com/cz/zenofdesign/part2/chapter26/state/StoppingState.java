package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: StoppingState
 * @date: 2019/7/12  15:35
 * @author: guohao
 * @Description: 关闭状态
 */
public class StoppingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.openningstate);
        super.context.getLiftState().open();
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
        System.out.println("电梯停止了");
    }
}

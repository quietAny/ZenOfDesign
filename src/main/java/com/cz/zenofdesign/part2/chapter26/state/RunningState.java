package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: RunningState
 * @date: 2019/7/12  15:35
 * @author: guohao
 * @Description: 运行状态
 */
public class RunningState extends LiftState {
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
        System.out.println("电梯正在运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}

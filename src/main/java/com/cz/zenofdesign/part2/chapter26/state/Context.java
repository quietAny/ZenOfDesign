package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: Context
 * @date: 2019/7/12  15:27
 * @author: guohao
 * @Description: 上下文类
 */
public class Context {

    //定义所有的电梯状态
    public final static OpenningState openningstate = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();
    //定义当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的状态通知到每个实现类
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}

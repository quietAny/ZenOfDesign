package com.cz.zenofdesign.part2.chapter26.state;

/**
 * @ClassName: LiftState
 * @date: 2019/7/12  15:26
 * @author: guohao
 * @Description: 抽象电梯状态
 */
public abstract class LiftState {

    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();


}

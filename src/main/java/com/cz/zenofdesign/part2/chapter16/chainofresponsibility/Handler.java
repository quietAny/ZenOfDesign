package com.cz.zenofdesign.part2.chapter16.chainofresponsibility;

/**
 * @ClassName: Handler
 * @date: 2019/7/11  16:01
 * @author: guohao
 * @Description:
 */
public abstract class Handler {

    private Handler nextHander;

    /**
     * 每个处理者都必须对请求作出处理
     * @param request
     * @return
     */
    public final Response handleMessage(Request request){

        Response respose = null;
        if(this.getHandlerLevel().equals(request.getRequestLevel())){
            respose = this.echo(request);
        } else {
            if(this.nextHander != null){
                respose = this.nextHander.handleMessage(request);
            } else {
                System.out.println("没有适当的处理着，业务自行处理");
            }
        }

        return respose;
    }

    /**
     * 设置下一个处理者
     * @param handler
     */
    public void setNext(Handler handler){
        this.nextHander = handler;
    }

    /**
     * 每个处理者都有一个处理级别
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都必须实现的处理任务
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);
}

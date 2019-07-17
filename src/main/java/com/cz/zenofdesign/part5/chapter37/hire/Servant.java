package com.cz.zenofdesign.part5.chapter37.hire;

/**
 * @ClassName: Servant
 * @date: 2019/7/17  13:20
 * @author: guohao
 * @Description: 雇工类
 */
public class Servant {

    /**
     * 服务内容
     * @param serviceFuture
     */
    public void service(IServiced serviceFuture){
        serviceFuture.serviced();
    }
}

package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.observer;



import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * @ClassName: DnsServer
 * @date: 2019/7/15  17:55
 * @author: guohao
 * @Description:
 */
public abstract class DnsServer extends Observable implements Observer {

    /**
     * 处理请求
     * @param arg0
     * @param arg1
     */
    public void update(Observable arg0,Object arg1){
        Recorder recorder = (Recorder)arg1;
        if(isLocal(recorder)){
            recorder.setIp(getIpAddress());
        }else{
            responsFromUpperServer(recorder);
        }
        //签名
        sign(recorder);
    }

    /**
     * 每个dns签上自己的名字
     * @param recorder
     */
    protected abstract void sign(Recorder recorder);

    /**
     * 添加观察者
     * @param dnsServer
     */
    public void setUpperServer(DnsServer dnsServer){
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    /**
     * 通知观察者
     * @param recorder
     */
    private void responsFromUpperServer(Recorder recorder){
        super.setChanged();
        super.notifyObservers(recorder);
    }
    //每个dns服务器都必须定义自己的处理级别
    protected abstract boolean isLocal(Recorder recorder);

    /**
     * 获得ip
     * @return
     */
    private String getIpAddress(){
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(10) + "." + random.nextInt(100);
        return address;

    }

}

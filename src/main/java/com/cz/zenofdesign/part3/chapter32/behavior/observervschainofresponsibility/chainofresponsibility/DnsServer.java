package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.chainofresponsibility;

import java.util.Random;

/**
 * @ClassName: DnsServer
 * @date: 2019/7/15  17:12
 * @author: guohao
 * @Description:
 */
public abstract class DnsServer {

    //上级dns
    private DnsServer upperServer;

    /**
     * 指向上级
     * @param upperServer
     */
    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    /**
     * 解析域名
     * @param domain
     * @return
     */
    public final Recorder resolve(String domain){
        Recorder recorder = null;
        if(isLocal(domain)){
            recorder = echo(domain);
        }else {
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    //检查域名是否在本区
    protected abstract boolean isLocal(String domain);

    /**
     * 每个dns服务器都必须实现的解析任务
     * @param domain
     * @return
     */
    protected Recorder echo(String domain){
        Recorder recorder = new Recorder();
        recorder.setDomain(domain);
        recorder.setIp(getIpAddress());
        return recorder;
    }

    /**
     * 获得ip地址
     * @return
     */
    private String getIpAddress(){
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(10) + "." + random.nextInt(100);
        return address;
    }
}

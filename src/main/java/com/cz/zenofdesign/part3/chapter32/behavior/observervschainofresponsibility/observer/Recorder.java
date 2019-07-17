package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.observer;

/**
 * @ClassName: Recorder
 * @date: 2019/7/15  17:09
 * @author: guohao
 * @Description:
 */
public class Recorder {

    private String domain;
    private String ip;
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String str= "域名：" + this.domain;
        str = str + "\nIP地址：" + this.ip;
        str = str + "\n解析者：" + this.owner;
        return str;
    }
}

package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.observer;

/**
 * @ClassName: TopDnsServer
 * @date: 2019/7/16  9:31
 * @author: guohao
 * @Description:
 */
public class TopDnsServer extends DnsServer{

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级dns服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}

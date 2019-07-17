package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.observer;

/**
 * @ClassName: ChinaTopDnsServer
 * @date: 2019/7/16  9:29
 * @author: guohao
 * @Description:
 */
public class ChinaTopDnsServer extends DnsServer{


    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级dns服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }
}

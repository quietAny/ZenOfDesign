package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.observer;

/**
 * @ClassName: ShangHaiDnsServer
 * @date: 2019/7/16  9:27
 * @author: guohao
 * @Description:
 */
public class ShangHaiDnsServer extends DnsServer {

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("上海dns服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }
}

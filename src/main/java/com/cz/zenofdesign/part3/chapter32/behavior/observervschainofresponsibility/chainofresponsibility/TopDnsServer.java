package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.chainofresponsibility;

/**
 * @ClassName: TopDnsServer
 * @date: 2019/7/15  17:30
 * @author: guohao
 * @Description:
 */
public class TopDnsServer extends DnsServer{
    @Override
    protected boolean isLocal(String domain) {
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("世界顶级dns服务器");
        return recorder;
    }
}

package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.chainofresponsibility;

/**
 * @ClassName: ShangHaiDNSServer
 * @date: 2019/7/15  17:25
 * @author: guohao
 * @Description:
 */
public class ShangHaiDnsServer extends DnsServer{
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海dns服务器");
        return recorder;
    }
}

package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.chainofresponsibility;

/**
 * @ClassName: ChinaTopDnsServer
 * @date: 2019/7/15  17:28
 * @author: guohao
 * @Description:
 */
public class ChinaTopDnsServer extends DnsServer{
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("中国顶级dnf服务器");
        return recorder;
    }
}

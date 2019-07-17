package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Client
 * @date: 2019/7/16  9:32
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws IOException {

        DnsServer sh = new ShangHaiDnsServer();

        DnsServer china = new ChinaTopDnsServer();

        DnsServer top = new TopDnsServer();

        china.setUpperServer(top);
        sh.setUpperServer(china);

        System.out.println("----域名解析器----");
        while (true){
            System.out.println("\n请输入域名(输入N退出)：");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if(domain.equalsIgnoreCase("n")){
                return;
            }
            Recorder recorder = new Recorder();
            recorder.setDomain(domain);
            sh.update(null,recorder);
            System.out.println("----DNS服务器解析结果----");
            System.out.println(recorder);
        }

    }
}

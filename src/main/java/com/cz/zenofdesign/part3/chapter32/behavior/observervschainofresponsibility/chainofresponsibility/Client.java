package com.cz.zenofdesign.part3.chapter32.behavior.observervschainofresponsibility.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Client
 * @date: 2019/7/15  17:34
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
        System.out.println("====域名模拟器====");
        while (true){
            System.out.println("\n请输入域名(输入N退出）：");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if(domain.equalsIgnoreCase("n")){
                return;
            }
            Recorder recorder = sh.resolve(domain);
            System.out.println("----域名解析结果----");
            System.out.println(recorder);
        }


    }
}

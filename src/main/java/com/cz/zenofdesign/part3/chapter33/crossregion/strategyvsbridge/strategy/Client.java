package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.strategy;

/**
 * @ClassName: Client
 * @date: 2019/7/16  10:17
 * @author: guohao
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        MailTemplate htmlMail = new HtmlMail("a@a.com","b@b.com","外星人攻击地球了","结局是外星人被打败了");
        MailServer mailServer = new MailServer(htmlMail);
        mailServer.sendMail();
    }
}

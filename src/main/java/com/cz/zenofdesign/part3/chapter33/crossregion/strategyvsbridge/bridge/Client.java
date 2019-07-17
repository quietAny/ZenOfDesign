package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.bridge;

/**
 * @ClassName: Client
 * @date: 2019/7/16  10:33
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        MailTemplate htmlMail = new HtmlMail("a@a.com","b@b.com","外星人攻击地球了","结局是外星人被打败了");
        MailServer mailServer = new Postfix(htmlMail);
        mailServer.sendMail();

   }
}

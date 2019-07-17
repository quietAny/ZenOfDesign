package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.strategy;

/**
 * @ClassName: MailServer
 * @date: 2019/7/16  10:08
 * @author: guohao
 * @Description:
 */
public class MailServer {

    private MailTemplate mailTemplate;


    public MailServer(MailTemplate mailTemplate) {
        this.mailTemplate = mailTemplate;
    }

    public void sendMail(){
        System.out.println("----正在发送消息----");
        System.out.println("发件人：" + mailTemplate.getFrom());
        System.out.println("收件人：" + mailTemplate.getTo());
        System.out.println("邮件标题：" + mailTemplate.getSubject());
        System.out.println("邮件内容：" + mailTemplate.getContext());
    }
}

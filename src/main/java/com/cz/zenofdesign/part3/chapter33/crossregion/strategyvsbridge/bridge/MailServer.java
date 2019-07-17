package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.bridge;

/**
 * @ClassName: MailServer
 * @date: 2019/7/16  10:24
 * @author: guohao
 * @Description:
 */
public abstract class MailServer {

    protected final MailTemplate mailTemplate;

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

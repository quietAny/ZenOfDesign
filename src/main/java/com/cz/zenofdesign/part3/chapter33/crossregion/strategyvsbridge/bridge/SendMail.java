package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.bridge;

/**
 * @ClassName: SendMail
 * @date: 2019/7/16  10:30
 * @author: guohao
 * @Description:
 */
public class SendMail extends MailServer {

    public SendMail(MailTemplate mailTemplate) {
        super(mailTemplate);
    }

    @Override
    public void sendMail() {
        super.mailTemplate.add("Receive:(sendmail); 7 Nov 2009 04:14:44 + 0100");
        super.sendMail();
    }
}

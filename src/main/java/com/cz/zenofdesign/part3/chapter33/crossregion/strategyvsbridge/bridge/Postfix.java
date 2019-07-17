package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.bridge;

/**
 * @ClassName: Postfix
 * @date: 2019/7/16  10:32
 * @author: guohao
 * @Description:
 */
public class Postfix extends MailServer {

    public Postfix(MailTemplate mailTemplate) {
        super(mailTemplate);
    }

    @Override
    public void sendMail() {
        String context = "Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by postfix\n";
        super.mailTemplate.add(context);
        super.sendMail();
    }
}

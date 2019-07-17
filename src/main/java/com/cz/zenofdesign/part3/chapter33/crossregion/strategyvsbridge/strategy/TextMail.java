package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.strategy;

/**
 * @ClassName: TextMail
 * @date: 2019/7/16  10:09
 * @author: guohao
 * @Description:
 */
public class TextMail extends MailTemplate {

    public TextMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {
        String context = "\nContent-type:text/plain;charset=GB2312\n" + super.getContext();
        context = context + "\ny邮件格式：文本格式";
        return context;
    }
}

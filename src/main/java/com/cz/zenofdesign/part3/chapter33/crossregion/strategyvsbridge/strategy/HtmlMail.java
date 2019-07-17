package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.strategy;

/**
 * @ClassName: HtmlMail
 * @date: 2019/7/16  10:10
 * @author: guohao
 * @Description:
 */
public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {
        String context = "\nContent-type:multipart/mixed;charset=GB2312\n" + super.getContext();
        context = context + "\n邮件格式：超文本格式";
        return context;
    }
}
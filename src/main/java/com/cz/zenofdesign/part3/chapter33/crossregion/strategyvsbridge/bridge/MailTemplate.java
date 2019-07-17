package com.cz.zenofdesign.part3.chapter33.crossregion.strategyvsbridge.bridge;

/**
 * @ClassName: MailTemplate
 * @date: 2019/7/16  10:25
 * @author: guohao
 * @Description:
 */
public abstract class MailTemplate {

    private String from;
    private String to;
    private String subject;
    private String context;

    public MailTemplate(String from, String to, String subject, String context) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.context = context;
    }

    public void add(String sendInfo){
        context = sendInfo + context;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}

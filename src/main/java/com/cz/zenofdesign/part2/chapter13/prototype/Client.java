package com.cz.zenofdesign.part2.chapter13.prototype;

import java.util.Random;

/**
 * @ClassName: Client
 * @date: 2019/7/10  15:15
 * @author: guohao
 * @Description:
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject() + "\t收件人： "+mail.getReceiver()+"\t...发送成功！");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i = 0; i<maxLength; i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx公司版权所有");
        while (i < MAX_COUNT){
            Mail cloneMail = (Mail) mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandString(5) + getRandString(8) + "@qq.com");
            sendMail(cloneMail);
            i++;
        }

    }
}

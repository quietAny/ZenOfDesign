package com.cz.zenofdesign.part2.chapter28.flyweight;

/**
 * @ClassName: SignInfo
 * @date: 2019/7/15  9:59
 * @author: guohao
 * @Description:
 */
public class SignInfo {

    private String id;
    private String location;
    private String subject;
    private String postAddress;

    public String getLocation() {
        return location;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

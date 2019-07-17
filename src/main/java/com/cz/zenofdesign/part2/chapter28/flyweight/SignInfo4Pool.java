package com.cz.zenofdesign.part2.chapter28.flyweight;

/**
 * @ClassName: SignInfo4Pool
 * @date: 2019/7/15  10:05
 * @author: guohao
 * @Description:
 */
public class SignInfo4Pool extends SignInfo{

    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

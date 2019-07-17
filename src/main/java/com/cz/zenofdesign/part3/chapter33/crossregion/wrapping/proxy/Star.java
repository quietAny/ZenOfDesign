package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.proxy;

/**
 * @ClassName: Star
 * @date: 2019/7/16  13:21
 * @author: guohao
 * @Description: 明星本人
 */
public class Star implements IStar{
    @Override
    public void Sign() {
        System.out.println("签名：郭浩");
    }
}

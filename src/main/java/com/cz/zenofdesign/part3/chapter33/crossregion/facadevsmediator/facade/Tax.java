package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.facade;

import java.util.Random;

/**
 * @ClassName: Tax
 * @date: 2019/7/16  11:27
 * @author: guohao
 * @Description: 税收
 */
public class Tax {

    /**
     * 获得税金
     */
    public int getTax(){
        return (new Random()).nextInt(300);
    }

}

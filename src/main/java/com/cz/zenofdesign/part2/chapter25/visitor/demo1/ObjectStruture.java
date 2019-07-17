package com.cz.zenofdesign.part2.chapter25.visitor.demo1;

import java.util.Random;

/**
 * @ClassName: ObjectStruture
 * @date: 2019/7/12  14:17
 * @author: guohao
 * @Description: 结构对象
 */
public class ObjectStruture {

    public static Element createElement(){
        Random random = new Random();
        if(random.nextInt(100) > 50){
            return new ConcreteElement1();
        }else {
            return new ConcreteElement2();
        }
    }
}

package com.cz.zenofdesign.part2.chapter28.flyweight;

import com.cz.zenofdesign.part2.chapter25.visitor.demo2.KongFuRole;

import java.util.HashMap;

/**
 * @ClassName: SignInfoFactory
 * @date: 2019/7/15  10:01
 * @author: guohao
 * @Description:
 */
public class SignInfoFactory {

    private static HashMap<String,SignInfo> pool = new HashMap<String, SignInfo>();

    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key){
        SignInfo result = null;
        if(!pool.containsKey(key)){
            System.out.println("建立对象，并放到池里");
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        }else {
            result = pool.get(key);
            System.out.println("直接从池中获取");
        }
        return result;
    }


}

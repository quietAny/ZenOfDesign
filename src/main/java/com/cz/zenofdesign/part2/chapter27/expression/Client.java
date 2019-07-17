package com.cz.zenofdesign.part2.chapter27.expression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @ClassName: Client
 * @date: 2019/7/15  9:33
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws IOException {

        String expStr = getExpStr();
        HashMap<String,Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
    }

    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (char ch : expStr.toCharArray()) {
            if(ch != '+' && ch != '-'){
                if(!map.containsKey(String.valueOf(ch))){
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}

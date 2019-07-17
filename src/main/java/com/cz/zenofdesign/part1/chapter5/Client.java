package com.cz.zenofdesign.part1.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Client
 * @date: 2019/7/9  16:58
 * @author: guohao
 * @Description: 迪米特原则
 */
public class Client {

    public static void main(String[] args) {

        List<Girl> girls = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }

        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(girls));
    }
}

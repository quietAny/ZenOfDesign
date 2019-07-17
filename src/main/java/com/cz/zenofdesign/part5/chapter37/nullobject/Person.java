package com.cz.zenofdesign.part5.chapter37.nullobject;

/**
 * @ClassName: Person
 * @date: 2019/7/17  13:30
 * @author: guohao
 * @Description:
 */
public class Person {

    /**
     * 听到叫声
     * @param animal
     */
    public void hear(Animal animal){
        if(animal != null){
            animal.makeSound();
        }
    }

}

package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: UserByAgeThan
 * @date: 2019/7/17  10:26
 * @author: guohao
 * @Description: 大于用户年龄规格类
 */
public class UserByAgeThan extends CompositeSpecification {

    private int age;

    public UserByAgeThan(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}

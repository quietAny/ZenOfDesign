package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: UserByNameEqual
 * @date: 2019/7/17  10:24
 * @author: guohao
 * @Description: 用户姓名相等规格书
 */
public class UserByNameEqual extends CompositeSpecification{

    //基准姓名
    private String name;

    public UserByNameEqual(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }


}

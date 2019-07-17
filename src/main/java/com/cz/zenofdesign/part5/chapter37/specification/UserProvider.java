package com.cz.zenofdesign.part5.chapter37.specification;

import java.util.ArrayList;

/**
 * @ClassName: UserProvider
 * @date: 2019/7/17  10:23
 * @author: guohao
 * @Description: 用户操作类
 */
public class UserProvider implements IUserProvider{

    private ArrayList<User> userList;

    public UserProvider(ArrayList<User> userList) {
        this.userList = userList;
    }

    @Override
    public ArrayList<User> findUser(IUserSpecification userSpec) {
        ArrayList<User> result = new ArrayList<User>();
        for(User u : userList){
            if(userSpec.isSatisfiedBy(u)){
                result.add(u);
            }
        }
        return result;
    }
}

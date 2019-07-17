package com.cz.zenofdesign.part5.chapter37.specification;

import java.util.ArrayList;

/**
 * @ClassName: IUserProvider
 * @date: 2019/7/17  10:21
 * @author: guohao
 * @Description:
 */
public interface IUserProvider {

    public ArrayList<User> findUser(IUserSpecification userSpec);
}

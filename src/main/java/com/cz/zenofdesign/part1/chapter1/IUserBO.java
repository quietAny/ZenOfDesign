package com.cz.zenofdesign.part1.chapter1;

/**
 * @ClassName: IUserBO
 * @date: 2019/7/9  14:45
 * @author: guohao
 * @Description: 负责用户的属性
 */
public interface IUserBO{

    void setUserId(String userId);
    String getUserId();
    void setPassword(String password);
    String getPassword();
    void setUserName(String userName);
    String getUserName();
}

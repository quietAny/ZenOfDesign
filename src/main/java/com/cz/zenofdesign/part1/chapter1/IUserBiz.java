package com.cz.zenofdesign.part1.chapter1;

/**
 * @ClassName: IUserBiz
 * @date: 2019/7/9  14:47
 * @author: guohao
 * @Description: 负责用户的行为
 */
public interface IUserBiz {

    boolean changePassword();
    boolean deleteUser(IUserBO userBO);
    void mapUser(IUserBO userBO);
    boolean addOrg(IUserBO userBO,int ordId);
    boolean addRole(IUserBO userBO,int roleId);
}

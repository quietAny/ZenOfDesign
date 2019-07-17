package com.cz.zenofdesign.part1.chapter1;

/**
 * @ClassName: UserInfo
 * @date: 2019/7/9  14:54
 * @author: guohao
 * @Description:
 */
public class UserInfo implements IUserInfo {

    @Override
    public void setUserId(String userId) {

    }

    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public void setPassword(String password) {
        System.out.println("设置成功");
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public boolean changePassword() {
        return false;
    }

    @Override
    public boolean deleteUser(IUserBO userBO) {
        System.out.println("删除成功");
        return false;
    }

    @Override
    public void mapUser(IUserBO userBO) {

    }

    @Override
    public boolean addOrg(IUserBO userBO, int ordId) {
        return false;
    }

    @Override
    public boolean addRole(IUserBO userBO, int roleId) {
        return false;
    }
}

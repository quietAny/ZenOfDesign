package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: IUserSpecification
 * @date: 2019/7/17  10:22
 * @author: guohao
 * @Description: 规格书接口
 */
public interface IUserSpecification {

    //是否满足要求
    public boolean isSatisfiedBy(User user);
    //and操作
    public IUserSpecification and(IUserSpecification spec);
    //or操作
    public IUserSpecification or(IUserSpecification spec);
    //not操作
    public IUserSpecification not();
}

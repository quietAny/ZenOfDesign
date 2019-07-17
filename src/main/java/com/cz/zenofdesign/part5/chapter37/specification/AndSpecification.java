package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: AndSpecification
 * @date: 2019/7/17  10:56
 * @author: guohao
 * @Description:
 */
public class AndSpecification extends CompositeSpecification{

    private IUserSpecification left;
    private IUserSpecification right;

    public AndSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 进行and运算
     * @param user
     * @return
     */
    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
    }
}

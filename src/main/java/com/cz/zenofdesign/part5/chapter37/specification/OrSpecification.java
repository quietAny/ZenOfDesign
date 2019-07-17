package com.cz.zenofdesign.part5.chapter37.specification;

/**
 * @ClassName: OrSpecification
 * @date: 2019/7/17  10:58
 * @author: guohao
 * @Description:
 */
public class OrSpecification extends CompositeSpecification {

    private IUserSpecification left;
    private IUserSpecification right;

    public OrSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }

    /**
     * or 运算
     * @param user
     * @return
     */
    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }

}
